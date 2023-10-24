package cn.codeguy.service.binder

import android.os.IBinder
import cn.codeguy.service.ICorePool

/**
 *@author V.shengcheng.kang
 *@date 2023/10/24 17:09
 *@desc
 **/
class CorePoolBinder: ICorePool.Stub() {
    private val mBinders= LinkedHashMap<Int, IBinder>()
    override fun getBinder(code: Int): IBinder? {
        if (mBinders.containsKey(code)) {
            return mBinders[code]
        }
        val binder: IBinder?
        when (code) {
            0 -> {
                binder = UserManagerBinder()
                mBinders[code] = binder
            }
            1 -> {
                binder = UserManagerBinder()
                mBinders[code] = binder
            }
        }
        return UserManagerBinder()
    }
}