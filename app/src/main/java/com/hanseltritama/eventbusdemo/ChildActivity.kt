package com.hanseltritama.eventbusdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_child.*
import kotlinx.android.synthetic.main.content_child.*
import org.greenrobot.eventbus.EventBus

class ChildActivity : AppCompatActivity() {

    private lateinit var triggerEventButton: Button
    private lateinit var messageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        messageEditText = resultEditTextChild
        triggerEventButton = launchButtonChild

        triggerEventButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val userText = messageEditText.text.toString()
                val event = CustomMessageEvent()
                event.setCustomMessage(userText)

                // send this event to subscribers
                EventBus.getDefault().post(event)

                finish()
            }
        })
    }

}
