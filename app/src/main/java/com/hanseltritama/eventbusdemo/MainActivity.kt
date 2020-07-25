package com.hanseltritama.eventbusdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class MainActivity : AppCompatActivity() {

    private lateinit var resultEditText: EditText
    private lateinit var launchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EventBus.getDefault().register(this)

        resultEditText = resultEditTextMain
        launchButton = launchButtonMain

        launchButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                intent = Intent(this@MainActivity, ChildActivity::class.java)
                startActivity(intent)
            }
        })
    }

    // it will run on Main Thread
    @Subscribe
    fun onEvent(event: CustomMessageEvent) {
        Log.d("HANSEL", "Event Fired " + event.getCustomMessage())

        // it will get an event from publisher
        resultEditText.setText(event.getCustomMessage())
    }
}
