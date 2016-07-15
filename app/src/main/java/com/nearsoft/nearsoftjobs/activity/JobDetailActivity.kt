package com.nearsoft.nearsoftjobs.activity

import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.nearsoft.nearsoftjobs.R
import com.nearsoft.nearsoftjobs.model.Job
import com.nearsoft.nearsoftjobs.util.getCharSequenceFromMarkdown
import com.nearsoft.nearsoftjobs.util.loadRemoteJobPage

/**
 * Created by epool on 7/14/16.
 */
class JobDetailActivity : AppCompatActivity() {

    companion object {

        private val ARG_JOB = "ARG_JOB"

        fun showJobDetail(context: Context, job: Job) {
            val intent = Intent(context, JobDetailActivity::class.java)
            intent.putExtra(ARG_JOB, job)
            context.startActivity(intent)
        }
    }

    private val mMarkdownTextView: TextView by lazy { findViewById(R.id.markdown_view) as TextView }
    private val mProgressBar: ProgressBar by lazy { findViewById(R.id.progressBar) as ProgressBar }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_detail)

        initViews()

        val job = jobFromIntent
        JobPageLoader().execute(job)
    }

    private fun initViews() {
        mMarkdownTextView.movementMethod = LinkMovementMethod.getInstance()
    }

    private val jobFromIntent: Job
        get() = intent.getParcelableExtra<Job>(ARG_JOB)

    private fun showProgressBar(show: Boolean) {
        mProgressBar.visibility = if (show) View.VISIBLE else View.GONE
    }

    private fun showMarkdownContent(markdown: String) {
        mMarkdownTextView.text = getCharSequenceFromMarkdown(markdown)
    }

    private inner class JobPageLoader : AsyncTask<Job, Void, String>() {

        override fun onPreExecute() {
            showProgressBar(true)
        }

        override fun doInBackground(vararg jobs: Job): String {
            val job = jobs[0]
            return loadRemoteJobPage(job.pageId)
        }

        override fun onPostExecute(markdownString: String) {
            showMarkdownContent(markdownString)
            showProgressBar(false)
        }

    }

}
