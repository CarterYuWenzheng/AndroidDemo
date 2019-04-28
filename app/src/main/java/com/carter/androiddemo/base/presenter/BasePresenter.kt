package com.carter.androiddemo.base.presenter

import com.carter.androiddemo.base.view.IView

class BasePresenter<T : IView> :IPresenter<T>{
    override fun attachView(view: T) {

    }

    override fun detachView() {

    }

    override fun reload() {

    }

    override fun registerEventBus() {

    }

    override fun unregisterEventBus() {

    }

    override fun setLoginStatus(loginStatus: Boolean) {

    }

    override fun getLoginStatus() {

    }

    override fun getLoginAccount() {

    }

    override fun setLoginAccount() {

    }

}