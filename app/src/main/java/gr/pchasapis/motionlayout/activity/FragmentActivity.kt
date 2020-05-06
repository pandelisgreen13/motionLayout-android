package gr.pchasapis.motionlayout.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import gr.pchasapis.motionlayout.R
import gr.pchasapis.motionlayout.fragment.DetailsFragment
import gr.pchasapis.motionlayout.fragment.MapFragment
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        initFragment()
    }

    private fun initFragment() {
        MapFragment.newInstance().also {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, it)
                .commitNow()
        }
        DetailsFragment.newInstance().also {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentDetailsContainerView, it)
                .commitNow()
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        if (fragment is MapFragment) {
            fragment.setMapInterface(object : MapFragment.MapListener{
                override fun onPinClicked() {
                    motionLayoutFrag.transitionToEnd()
                }
            })
        }
    }
}