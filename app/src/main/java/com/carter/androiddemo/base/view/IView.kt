package com.carter.androiddemo.base.view

interface IView {

    abstract fun showErrorMsg(errorMsg: String)

    abstract fun showLoading()

    abstract fun hideLoading()

    abstract fun showError()

    abstract fun showNoNetwork()

    abstract fun showEmpty()

    abstract fun showContent()

    abstract fun handleLoginSuccess()

    abstract fun handleLogoutSuccess()
}