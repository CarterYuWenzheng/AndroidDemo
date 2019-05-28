package com.carter.androiddemo.core.data

import com.carter.androiddemo.core.db.DBHelper
import com.carter.androiddemo.core.greenDao.HistoryData
import com.carter.androiddemo.core.http.HttpHelper
import com.carter.androiddemo.core.preference.PreferenceHelper

class DataManager(private val httpHelper: HttpHelper, private val dbHelper: DBHelper, private val preferenceHelper: PreferenceHelper) : HttpHelper, DBHelper, PreferenceHelper {

    override fun addHistoryData(data: String): MutableList<HistoryData> {
        return dbHelper.addHistoryData(data)
    }

    override fun clearAllHistoryData() {
        dbHelper.clearAllHistoryData()
    }

    override fun deleteHistoryDataById(id: Long) {
        dbHelper.deleteHistoryDataById(id)
    }

    override fun loadAllHistoryData(): MutableList<HistoryData> {
        return dbHelper.loadAllHistoryData()
    }

    override fun setLoginState(boolean: Boolean) {
        preferenceHelper.setLoginState(boolean)
    }

    override fun getLoginState(): Boolean {
        return preferenceHelper.getLoginState()
    }

    override fun setLoginAccount(account: String) {
        preferenceHelper.setLoginAccount(account)
    }

    override fun getLoginAccount(): String {
        return preferenceHelper.getLoginAccount()
    }

    override fun setNightMode(boolean: Boolean) {
        preferenceHelper.setNightMode(boolean)
    }

    override fun getNightMode(): Boolean {
        return preferenceHelper.getNightMode()
    }

}