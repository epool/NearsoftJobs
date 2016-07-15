package com.nearsoft.nearsoftjobs.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nearsoft.nearsoftjobs.R;
import com.nearsoft.nearsoftjobs.model.Job;

import java.util.List;

/**
 * Created by epool on 7/14/16.
 */
public class JobAdapter extends RecyclerView.Adapter<JobAdapter.JobViewHolder> {

    private List<Job> mJobs;
    private OnJobClickListener mOnJobClickListener;

    public JobAdapter(List<Job> jobs, OnJobClickListener onJobClickListener) {
        mJobs = jobs;
        mOnJobClickListener = onJobClickListener;
    }

    @Override
    public JobViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job, parent, false);
        return new JobViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JobViewHolder viewHolder, int position) {
        Job job = mJobs.get(position);
        viewHolder.bindView(job);
    }

    @Override
    public int getItemCount() {
        return mJobs.size();
    }

    public interface OnJobClickListener {
        void onJobClicked(Job job);
    }

    class JobViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView mJobNameTextView;

        JobViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mJobNameTextView = (TextView) itemView.findViewById(R.id.jobNameTextView);
        }

        void bindView(Job job) {
            mJobNameTextView.setText(job.getName());
        }

        @Override
        public void onClick(View view) {
            mOnJobClickListener.onJobClicked(mJobs.get(getAdapterPosition()));
        }
    }

}
