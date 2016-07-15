package com.nearsoft.nearsoftjobs.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.nearsoft.nearsoftjobs.R
import com.nearsoft.nearsoftjobs.model.Job

/**
 * Created by epool on 7/14/16.
 */
class JobAdapter(private val mJobs: List<Job>, private val mOnJobClickListener: (job: Job) -> Unit) : RecyclerView.Adapter<JobAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_job, parent, false)
        return JobViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: JobViewHolder, position: Int) {
        val job = mJobs[position]
        viewHolder.bindView(job)
    }

    override fun getItemCount(): Int {
        return mJobs.size
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private val mJobNameTextView: TextView

        init {
            itemView.setOnClickListener(this)
            mJobNameTextView = itemView.findViewById(R.id.jobNameTextView) as TextView
        }

        fun bindView(job: Job) {
            mJobNameTextView.text = job.name
        }

        override fun onClick(view: View) {
            mOnJobClickListener(mJobs[adapterPosition])
        }

    }

}
