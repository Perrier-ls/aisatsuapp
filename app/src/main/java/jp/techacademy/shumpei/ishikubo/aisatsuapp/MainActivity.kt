package jp.techacademy.shumpei.ishikubo.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showTimePicker(view: View){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                showPickTime.text = greetingJudgement(hour)
            },
            13, 0, true)
        timePickerDialog.show()
    }

    /**
     * greetingJudgement
     * 渡された引数に応じて挨拶を分ける
     * @param Int $hour
     * @return String
     */
    fun greetingJudgement(hour: Int):String{
        val greeting:String

        if ((hour >= 2)&&(hour <= 9)) {
            greeting = "おはよう"
        } else if (hour <= 17) {
            greeting = "こんにちは"
        } else {
            greeting = "こんばんは"
        }
        return greeting
    }
}
