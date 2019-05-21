package com.carter.androiddemo.base.presenter

import com.carter.androiddemo.base.view.IView
import com.carter.androiddemo.core.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BasePresenter<T : IView> : IPresenter<T> {

    private var mView: T? =null

    @Inject
    lateinit var dataManager: DataManager

    private var compositeDisposable: CompositeDisposable? = null

    override fun attachView(view: T) {
        this.mView = view
        registerEventBus()
    }

    override fun detachView() {
        mView = null
        compositeDisposable!!.clear()
        unregisterEventBus()
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