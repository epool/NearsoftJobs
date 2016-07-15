package com.nearsoft.nearsoftjobs.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by epool on 7/14/16.
 */
public class Job implements Parcelable {

    public static final Parcelable.Creator<Job> CREATOR = new Parcelable.Creator<Job>() {
        @Override
        public Job createFromParcel(Parcel source) {
            return new Job(source);
        }

        @Override
        public Job[] newArray(int size) {
            return new Job[size];
        }
    };

    private String name;
    private String pageId;

    public Job() {
    }

    private Job(Parcel in) {
        this.name = in.readString();
        this.pageId = in.readString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return name != null ? name.equals(job.name) : job.name == null &&
                (pageId != null ? pageId.equals(job.pageId) : job.pageId == null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (pageId != null ? pageId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", pageId='" + pageId + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.pageId);
    }

}
