package gr.pchasapis.motionlayout.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gr.pchasapis.motionlayout.R
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
        button3.setOnClickListener {
            startIntent(FragmentActivity::class.java)
        }
        button4.setOnClickListener {
            startIntent(ViberActivity::class.java)
        }
    }

    private fun startIntent(activityClass: Class<*>) {
        startActivity(Intent(this@MainActivity, activityClass))
    }
}