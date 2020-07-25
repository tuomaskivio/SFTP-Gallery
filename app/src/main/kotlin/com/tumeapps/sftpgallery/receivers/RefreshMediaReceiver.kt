package com.tumeapps.sftpgallery.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.simplemobiletools.commons.helpers.REFRESH_PATH
import com.tumeapps.sftpgallery.extensions.addPathToDB

class RefreshMediaReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val path = intent.getStringExtra(REFRESH_PATH) ?: return
        context.addPathToDB(path)
    }
}
