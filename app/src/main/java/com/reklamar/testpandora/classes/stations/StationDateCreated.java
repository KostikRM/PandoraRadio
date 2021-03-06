
package com.reklamar.testpandora.classes.stations;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StationDateCreated {

    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("hours")
    @Expose
    private Integer hours;
    @SerializedName("minutes")
    @Expose
    private Integer minutes;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("nanos")
    @Expose
    private Integer nanos;
    @SerializedName("seconds")
    @Expose
    private Integer seconds;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("timezoneOffset")
    @Expose
    private Integer timezoneOffset;
    @SerializedName("year")
    @Expose
    private Integer year;

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getNanos() {
        return nanos;
    }

    public void setNanos(Integer nanos) {
        this.nanos = nanos;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
