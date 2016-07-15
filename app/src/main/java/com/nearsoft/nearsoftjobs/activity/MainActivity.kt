package com.nearsoft.nearsoftjobs.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import com.nearsoft.nearsoftjobs.R
import com.nearsoft.nearsoftjobs.adapter.JobAdapter
import com.nearsoft.nearsoftjobs.data.JobData
import com.nearsoft.nearsoftjobs.model.Job

/**
 * Created by epool on 7/14/16.
 */
class MainActivity : AppCompatActivity(), JobAdapter.OnJobClickListener {

    private val mJobAdapter = JobAdapter(JobData.JOBS, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val jobsRecyclerView = findViewById(R.id.jobsRecyclerView) as RecyclerView

        jobsRecyclerView.adapter = mJobAdapter
        jobsRecyclerView.layoutManager = LinearLayoutManager(this)
        jobsRecyclerView.setHasFixedSize(true)
    }

    override fun onJobClicked(job: Job) {
        JobDetailActivity.showJobDetail(this, job)
    }

}
