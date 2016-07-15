package com.nearsoft.nearsoftjobs.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.nearsoft.nearsoftjobs.R;
import com.nearsoft.nearsoftjobs.model.Job;
import com.nearsoft.nearsoftjobs.util.Util;

/**
 * Created by epool on 7/14/16.
 */
public class JobDetailActivity extends AppCompatActivity {

    private static final String ARG_JOB = "ARG_JOB";

    private TextView mMarkdownTextView;
    private ProgressBar mProgressBar;

    static void showJobDetail(Context context, Job job) {
        Intent intent = new Intent(context, JobDetailActivity.class);
        intent.putExtra(ARG_JOB, job);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        initViews();

        Job job = getJobFromIntent();
        new JobPageLoader().execute(job);
    }

    private void initViews() {
        mMarkdownTextView = (TextView) findViewById(R.id.markdown_view);
        mMarkdownTextView.setMovementMethod(LinkMovementMethod.getInstance());
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    private Job getJobFromIntent() {
        return getIntent().getParcelableExtra(ARG_JOB);
    }

    private void showProgressBar(boolean show) {
        mProgressBar.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    private void showMarkdownContent(String markdown) {
        mMarkdownTextView.setText(Util.getCharSequenceFromMarkdown(this, markdown));
    }

    private class JobPageLoader extends AsyncTask<Job, Void, String> {

        @Override
        protected void onPreExecute() {
            showProgressBar(true);
        }

        @Override
        protected String doInBackground(Job... jobs) {
            Job job = jobs[0];
            return Util.loadRemoteJobPage(job.getPageId());
        }

        @Override
        protected void onPostExecute(String markdownString) {
            showMarkdownContent(markdownString);
            showProgressBar(false);
        }

    }

}
