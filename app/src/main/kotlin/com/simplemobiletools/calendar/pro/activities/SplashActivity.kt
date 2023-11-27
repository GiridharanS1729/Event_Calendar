package com.simplemobiletools.calendar.pro.activities

import android.content.Intent
import com.simplemobiletools.calendar.pro.extensions.getNewEventTimestampFromCode
import com.simplemobiletools.calendar.pro.helpers.*
import com.simplemobiletools.commons.activities.BaseSplashActivity
import org.joda.time.DateTime

class SplashActivity : BaseSplashActivity() {
    override fun initActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
