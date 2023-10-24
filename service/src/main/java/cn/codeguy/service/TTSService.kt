package cn.codeguy.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 *@author V.shengcheng.kang
 *@date 2023/10/24 17:28
 *@desc
 **/
class TTSService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}