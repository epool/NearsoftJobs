package com.nearsoft.nearsoftjobs.util

import `in`.uncod.android.bypass.Bypass
import android.app.Activity
import android.widget.Toast
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import java.io.IOException

/**
 * Created by epool on 7/14/16.
 */

private val RETROFIT = Retrofit.Builder().baseUrl("https://raw.githubusercontent.com/Nearsoft/jobs/master/").build()
private val JOB_SERVICE = RETROFIT.create(JobService::class.java)

fun loadRemoteJobPage(jobPage: String): String {
    val call = JOB_SERVICE.getUser(jobPage)
    try {
        // Execute synchronously to show the use of an AsyncTask
        val response = call.execute()
        return response.body().string()
    } catch (e: IOException) {
        e.printStackTrace()
        return e.message!!
    }
}

fun Activity.toast(message: String, duration: Int = Toast.LENGTH_LONG): Unit {
    Toast.makeText(this, message, duration).show()
}

fun Activity.getCharSequenceFromMarkdown(markdown: String): CharSequence {
    val bypass = Bypass(this)
    return bypass.markdownToSpannable(markdown)
}

interface JobService {
    @GET("{jobPage}.md")
    fun getUser(@Path("jobPage") jobPage: String): Call<ResponseBody>
}
