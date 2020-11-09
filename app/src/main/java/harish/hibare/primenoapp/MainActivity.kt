package harish.hibare.primenoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myedit=findViewById<EditText>(R.id.editTextTextPersonName)
        val mytv =findViewById<TextView>(R.id.textView)
        val btn =findViewById<Button>(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val num: Int = myedit.text.toString().toInt()
            if (isPrimeNo(num)) {
                mytv.text = ("$num is a Prime Number")
            } else {
                mytv.text =("$num is not a Prime Number")
            }
        })

    }
    fun isPrimeNo(number: Int ): Boolean {
        if(number<2) return false
        for (i in 2..number/2) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

}