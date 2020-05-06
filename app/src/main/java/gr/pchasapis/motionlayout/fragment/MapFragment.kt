package gr.pchasapis.motionlayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gr.pchasapis.motionlayout.R
import kotlinx.android.synthetic.main.fragment_map.*

class MapFragment : Fragment() {

    lateinit var callback: MapListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLayout()
    }

    private fun initLayout() {
        pinButton.setOnClickListener {
            callback.onPinClicked()
        }
    }

    fun setMapInterface(callback: MapListener) {
        this.callback = callback
    }

    companion object {
        fun newInstance() = MapFragment()
    }

    interface MapListener {
        fun onPinClicked()
    }
}