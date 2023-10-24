package cn.codeguy.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import cn.codeguy.service.binder.CorePoolBinder

/**
 * @author V.shengcheng.kang
 * @date 2023/10/24 17:18
 * @desc
 */
class CoreService : Service() {
    lateinit var corePoolBinder: CorePoolBinder

    override fun onCreate() {
        super.onCreate()
        corePoolBinder = CorePoolBinder()
    }

    override fun onBind(intent: Intent): IBinder? {
        return corePoolBinder.getBinder(intent.getIntExtra("binderType", 0))
    }
}