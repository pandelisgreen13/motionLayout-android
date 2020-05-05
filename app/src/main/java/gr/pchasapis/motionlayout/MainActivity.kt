package gr.pchasapis.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            startIntent(SwipeActivity::class.java)
        }

        button2.setOnClickListener {
            startIntent(TextViewActivity::class.java)
        }
    }

    private fun startIntent(java: Class<*>) {
        startActivity(Intent(this@MainActivity, java))
    }
}