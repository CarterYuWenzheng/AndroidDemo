package com.carter.androiddemo.core.http

import com.carter.androiddemo.modules.login.LoginData
import io.reactivex.Observable

interface HttpHelper {

    fun register(username: String, password: String, rePassWord: String): Observable<BaseResponse<LoginData>>
}