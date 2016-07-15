package com.nearsoft.nearsoftjobs.util;

import android.content.Context;

import java.io.IOException;

import in.uncod.android.bypass.Bypass;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by epool on 7/14/16.
 */
public class Util {

    private final static Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/Nearsoft/jobs/master/")
            .build();

    private final static JobService JOB_SERVICE = RETROFIT.create(JobService.class);

    public static String loadRemoteJobPage(String jobPage) {
        Call<ResponseBody> call = JOB_SERVICE.getUser(jobPage);
        try {
            // Execute synchronously to show the use of an AsyncTask
            Response<ResponseBody> response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public static CharSequence getCharSequenceFromMarkdown(Context context, String markdown) {
        Bypass bypass = new Bypass(context);
        return bypass.markdownToSpannable(markdown);
    }

    private interface JobService {
        @GET("{jobPage}.md")
        Call<ResponseBody> getUser(@Path("jobPage") String jobPage);
    }

}
