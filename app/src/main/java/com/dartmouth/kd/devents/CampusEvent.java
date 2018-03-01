package com.dartmouth.kd.devents;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.database.Exclude;

import java.net.URL;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by kathrynflattum on 2/25/18.
 */

public class CampusEvent {

    private Long mId;
    private String mTitle;
    private String mLocation;
    private String mDescription;
    private Calendar mDate;
    private Calendar mStart;
    private Calendar mEnd;
    private String mUrl;
    private Double mLatitude;
    private Double mLongitude;
    private int mFood;
    private String mEventType;
    private String mProgramType;
    private String mYear;
    private String mMajor;
    private String mGreekSociety;
    private String mGender;

    public CampusEvent(){
        this.mTitle = "";
        this.mLocation = "";
        this.mDescription = "";
        this.mDate = Calendar.getInstance();
        this.mStart = Calendar.getInstance();
        this.mEnd = Calendar.getInstance();
        this.mUrl = "";
        this.mLatitude = null;
        this.mLongitude = null;
        this.mFood = 0;
        this.mEventType = "";
        this.mProgramType = "";
        this.mYear = "";
        this.mMajor = "";
        this.mGender = "";
        this.mGreekSociety="";


    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long id) {
        this.mId = id;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        this.mTitle = title;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String location) {
        this.mLocation = location;
    }

    public Double getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(Double latitude) {
        this.mLatitude = latitude;
    }

    public Double getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(Double longitude) {
        this.mLongitude = longitude;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String description) {
        this.mDescription = description;
    }

    @Exclude
    public Calendar getmDate() {
        return mDate;
    }

    public void setmDate(int year, int monthOfYear, int dayOfMonth) {
        mDate.set(year, monthOfYear, dayOfMonth);
    }

    public long getmDateTimeInMillis() {
        return mDate.getTimeInMillis();
    }


    public void setmDateTime(Calendar dateTime) {
        this.mDate = dateTime;

    }

    public void setmDateTime(long timestamp) {
        this.mDate.setTimeInMillis(timestamp);
    }


    public void setmStart(int hourOfDay, int minute) {
        mStart.set(Calendar.HOUR_OF_DAY, hourOfDay);
        mStart.set(Calendar.MINUTE, minute);
        mStart.set(Calendar.SECOND, 0);
    }

    public void setmStart(long timestamp){
        this.mDate.setTimeInMillis(timestamp);
    }

    @Exclude
    public Calendar getmStart() {
        return mStart;
    }


    public void setmEnd(int hourOfDay, int minute) {
        mEnd.set(Calendar.HOUR_OF_DAY, hourOfDay);
        mEnd.set(Calendar.MINUTE, minute);
        mEnd.set(Calendar.SECOND, 0);
    }

    public void setmEnd(long timestamp){
        this.mDate.setTimeInMillis(timestamp);
    }

    @Exclude
    public Calendar getmEnd() {
        return mEnd;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String url) {
        this.mUrl = url;
    }

    public int getmFood(){
        return mFood;
    }

    public void setmFood(int food){
        this.mFood = food;
    }

    public String getmEventType() {
        return mEventType;
    }

    public void setmEventType(String eventType) {
        this.mEventType = eventType;
    }

    public String getmProgramType() {
        return mProgramType;
    }

    public void setmProgramType(String programType) {
        this.mProgramType = programType;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String year) {
        this.mYear = year;
    }

    public String getmMajor() {
        return mMajor;
    }

    public void setmMajor(String major) {
        this.mMajor = major;
    }

    public String getmGreekSociety() {
        return mGreekSociety;
    }

    public void setmGreekSociety(String greekSociety) {
        this.mGreekSociety = greekSociety;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String gender) {
        this.mGender = gender;
    }

}