package com.carter.androiddemo

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
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
        val context:Context by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()

    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return mAndroidInjector
    }

    internal fun getContext(): Context {
        return context
    }

}
