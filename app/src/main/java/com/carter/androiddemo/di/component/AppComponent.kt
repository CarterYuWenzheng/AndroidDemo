package com.carter.androiddemo.di.component

import com.carter.androiddemo.MyApplication
import com.carter.androiddemo.di.module.AppModule
import com.carter.androiddemo.di.module.HttpModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, HttpModule::class])
interface AppComponent {
    fun inject(myApplication: MyApplication)
}