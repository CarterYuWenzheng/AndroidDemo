package com.carter.androiddemo.base.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.SupportActivity

abstract class AbstractSimpleActivity : SupportActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}