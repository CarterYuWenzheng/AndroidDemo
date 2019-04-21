package com.carter.androiddemo

import android.app.Activity
import android.app.Application
import android.content.Context
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication : Application
,HasActivityInjector{

    constructor() : super()

    @Inject
    lateinit var mAndroidInjector: DispatchingAndroidInjector<Activity>

    lateinit var context:Context

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        
    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return mAndroidInjector
    }

}
