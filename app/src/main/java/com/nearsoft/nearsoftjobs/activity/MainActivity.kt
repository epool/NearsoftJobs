package com.nearsoft.nearsoftjobs.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.nearsoft.nearsoftjobs.R
import com.nearsoft.nearsoftjobs.adapter.JobAdapter
import com.nearsoft.nearsoftjobs.data.JobData

/**
 * Created by epool on 7/14/16.
 */
class MainActivity : AppCompatActivity() {

    val jobsRecyclerView: RecyclerView by lazy { findViewById(R.id.jobsRecyclerView) as RecyclerView }

    private val mJobAdapter = JobAdapter(JobData.JOBS) {
        JobDetailActivity.showJobDetail(this, it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        jobsRecyclerView.adapter = mJobAdapter
        jobsRecyclerView.layoutManager = LinearLayoutManager(this)
        jobsRecyclerView.setHasFixedSize(true)
    }

}
