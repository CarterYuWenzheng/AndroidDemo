package com.carter.androiddemo

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.support.v7.app.AppCompatDelegate
import com.carter.androiddemo.core.data.DataManager
import com.squareup.leakcanary.LeakCanary
import com.squareup.leakcanary.RefWatcher
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject
import kotlin.properties.Delegates

@SuppressLint("Registered")
class MyApplication : Application()
        , HasActivityInjector {

    @Inject
    lateinit var mAndroidInjector: DispatchingAndroidInjector<Activity>

    companion object {
        val context: Context by Delegates.notNull()
        private lateinit var refWatch: RefWatcher
        @Inject
        private lateinit var mDataManager: DataManager

        fun isNightMode(): Boolean {
            return MyApplication.mDataManager.getNightMode()
        }


        fun getRefWatcher(context: Context): RefWatcher {
            return this.refWatch
        }
    }

    override fun onCreate() {
        super.onCreate()
        refWatch = setupLeakCanary()
        if (mDataManager.getNightMode()) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

    private fun setupLeakCanary(): RefWatcher {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return RefWatcher.DISABLED
        } else {
            return LeakCanary.install(this)
        }
    }


    override fun activityInjector(): AndroidInjector<Activity>? {
        return mAndroidInjector
    }


}
