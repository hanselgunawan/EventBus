package com.hanseltritama.eventbusdemo

class CustomMessageEvent {

    // Plain Old Kotlin Object
    private lateinit var customMessage: String

        fun getCustomMessage(): String {
            return customMessage
        }
        fun setCustomMessage(customMessage: String) {
            this.customMessage = customMessage
        }

}
