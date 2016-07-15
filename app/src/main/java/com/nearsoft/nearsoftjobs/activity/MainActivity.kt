package com.nearsoft.nearsoftjobs.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.nearsoft.nearsoftjobs.R
import com.nearsoft.nearsoftjobs.adapter.JobAdapter
import com.nearsoft.nearsoftjobs.data.JobData
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by epool on 7/14/16.
 */
class MainActivity : AppCompatActivity() {

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
