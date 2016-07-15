package com.nearsoft.nearsoftjobs.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import android.view.View
import com.nearsoft.nearsoftjobs.R
import com.nearsoft.nearsoftjobs.model.Job
import com.nearsoft.nearsoftjobs.util.getCharSequenceFromMarkdown
import com.nearsoft.nearsoftjobs.util.loadRemoteJobPage
import kotlinx.android.synthetic.main.activity_job_detail.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

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

    private val jobFromIntent: Job
        get() = intent.getParcelableExtra<Job>(ARG_JOB)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_detail)

        initView()

        requestJobDetail()
    }

    private fun requestJobDetail() {
        showProgressBar(true)
        doAsync {
            val markdownString = loadRemoteJobPage(jobFromIntent.pageId)
            uiThread {
                showMarkdownContent(markdownString)
                showProgressBar(false)
            }
        }
    }

    private fun initView() {
        markdownTextView.movementMethod = LinkMovementMethod.getInstance()
    }

    private fun showProgressBar(show: Boolean) {
        progressBar.visibility = if (show) View.VISIBLE else View.GONE
    }

    private fun showMarkdownContent(markdown: String) {
        markdownTextView.text = getCharSequenceFromMarkdown(markdown)
    }

}
