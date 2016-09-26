package com.nearsoft.nearsoftjobs.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by epool on 7/14/16.
 */
data class Job(val name: String, val pageId: String) : Parcelable {

    companion object {

        @JvmField val CREATOR: Parcelable.Creator<Job> = object : Parcelable.Creator<Job> {

            override fun createFromParcel(source: Parcel): Job = Job(source)

            override fun newArray(size: Int): Array<Job?> = arrayOfNulls(size)

        }

    }

    constructor(source: Parcel) : this(source.readString(), source.readString())

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(pageId)
    }

}