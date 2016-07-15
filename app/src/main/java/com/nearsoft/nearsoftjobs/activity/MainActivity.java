package com.nearsoft.nearsoftjobs.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nearsoft.nearsoftjobs.R;
import com.nearsoft.nearsoftjobs.adapter.JobAdapter;
import com.nearsoft.nearsoftjobs.data.JobData;
import com.nearsoft.nearsoftjobs.model.Job;

/**
 * Created by epool on 7/14/16.
 */
public class MainActivity extends AppCompatActivity implements JobAdapter.OnJobClickListener {

    private final JobAdapter mJobAdapter = new JobAdapter(JobData.JOBS, this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        RecyclerView jobsRecyclerView = (RecyclerView) findViewById(R.id.jobsRecyclerView);

        jobsRecyclerView.setAdapter(mJobAdapter);
        jobsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        jobsRecyclerView.setHasFixedSize(true);
    }

    @Override
    public void onJobClicked(Job job) {
        JobDetailActivity.showJobDetail(this, job);
    }

}
