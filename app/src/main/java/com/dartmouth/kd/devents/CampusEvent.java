package com.dartmouth.kd.devents;

import java.util.Calendar;

/**
 * Created by kathrynflattum on 2/25/18.
 */

public class CampusEvent {

    private Long mId;
    private String Title;
    private String Location;
    private String Description;
    private String Date;
    private String Start;
    private String End;
    private String URL;
    private Double Latitude;
    private Double Longitude;
    private int Food;
    private int EventType;
    private int ProgramType;
    private int Year;
    private int Major;
    private int GreekSociety;
    private int Gender;

    public CampusEvent(){
        this.Title = "";
        this.Location = "";
        this.Description = "";
        this.Date = "";
        this.Start = "";
        this.End = "";
        this.URL = "";
        this.Latitude = null;
        this.Longitude = null;
        this.Food = 0;
        this.EventType = 0;
        this.ProgramType = 0;
        this.Year = 0;
        this.Major = 0;
        this.Gender = 0;
        this.GreekSociety=0;


    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long id) {
        this.mId = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        this.Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        this.Longitude = longitude;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    //@Exclude
    public String getmDate() {
        return Date;
    }

    public void setmDate(int year, int monthOfYear, int dayOfMonth) {
        Calendar date = Calendar.getInstance();
        date.set(year, monthOfYear, dayOfMonth);
        date.toString();
        Date = date.toString();
    }

    public long getDateTimeInMillis() {
        long mDate = 0;
        return mDate;
    }


    public void setDateTime(Calendar dateTime) {
        //this.mDate = dateTime;

    }

    public void setDateTime(long timestamp) {

        //this.mDate.setTimeInMillis(timestamp);
    }


    public void setStart(int hourOfDay, int minute) {
        Calendar date = Calendar.getInstance();
        Start = date.toString();
        //mStart.set(Calendar.HOUR_OF_DAY, hourOfDay);
        //mStart.set(Calendar.MINUTE, minute);
        //mStart.set(Calendar.SECOND, 0);
    }

    public void setStart(String start){
        this.Start = start;
        //this.mDate.setTimeInMillis(timestamp);
    }

    public void setDateTime(String date){
        this.Date = date;
    }

    //public void setmDate(String d

    //@Exclude
    public String getmStart() {
        return Start;
    }


    public void setEnd(int hourOfDay, int minute) {
        Calendar date = Calendar.getInstance();
        End = date.toString();
        //mEnd.set(Calendar.HOUR_OF_DAY, hourOfDay);
        //mEnd.set(Calendar.MINUTE, minute);
        //mEnd.set(Calendar.SECOND, 0);
    }

    public void setEnd(String end){
        this.End = end;
    }

    //@Exclude
    public String getmEnd() {
        return End;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String url) {
        this.URL = url;
    }

    public int getFood(){
        return Food;
    }

    public void setFood(int food){
        this.Food = food;
    }

    public int getEventType() {
        return EventType;
    }

    public void setEventType(int eventType) {
        this.EventType = eventType;
    }

    public int getProgramType() {
        return ProgramType;
    }

    public void setProgramType(int programType) {
        this.ProgramType = programType;
    }

    public int getYear() {
        return Year;
    }

    public void setmYear(int year) {
        this.Year = year;
    }

    public int getMajor() {
        return Major;
    }

    public void setMajor(int major) {
        this.Major = major;
    }

    public int getGreekSociety() {
        return GreekSociety;
    }

    public void setGreekSociety(int greekSociety) {
        this.GreekSociety = greekSociety;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        this.Gender = gender;
    }

}