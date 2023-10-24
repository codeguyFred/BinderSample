package cn.codeguy.service.binder

import android.util.Log
import cn.codeguy.service.IUserManager

/**
 *@author V.shengcheng.kang
 *@date 2023/10/24 17:30
 *@desc
 **/
class UserManagerBinder: IUserManager.Stub() {
    companion object{
        const val TAG="UserManagerBinder"
    }
    override fun logout() {
        Log.i(TAG,"logout")
    }
}