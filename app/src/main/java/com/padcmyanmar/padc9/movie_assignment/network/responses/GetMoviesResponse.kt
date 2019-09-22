package com.padcmyanmar.padc9.movie_assignment.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import com.padcmyanmar.padc9.movie_assignment.utils.CODE_RESPONSE_OK

class GetMoviesResponse(
    @SerializedName("code")
    val code: Int,

    @SerializedName("message")
    val message: String,

    @SerializedName("data")
    val data: List<MoviesVO>?) {
        fun isResponseOK(): Boolean{
            return code == CODE_RESPONSE_OK && data!= null
        }
}