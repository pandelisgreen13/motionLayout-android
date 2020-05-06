package gr.pchasapis.motionlayout.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gr.pchasapis.motionlayout.R
import kotlinx.android.synthetic.main.activity_viber.*

class ViberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viber)
        initLayout()
    }

    private fun initLayout() {
        send.setOnClickListener { viberMotionLayout.transitionToEnd() }
        video.setOnClickListener { viberMotionLayout.transitionToStart() }
    }
}