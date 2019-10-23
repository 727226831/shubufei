package com.example.shubufei.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {


    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcompanyname() {
        return ccompanyname;
    }

    public void setCcompanyname(String ccompanyname) {
        this.ccompanyname = ccompanyname;
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode;
    }

    public String getCinvname() {
        return cinvname;
    }

    public void setCinvname(String cinvname) {
        this.cinvname = cinvname;
    }

    public String getDstartdate() {
        return dstartdate;
    }

    public void setDstartdate(String dstartdate) {
        this.dstartdate = dstartdate;
    }

    public String getDenddate() {
        return denddate;
    }

    public void setDenddate(String denddate) {
        this.denddate = denddate;
    }

    public String getIquantity() {
        return iquantity;
    }

    public void setIquantity(String iquantity) {
        this.iquantity = iquantity;
    }

    private String cinvcode;
    private String cinvname;
    private String dstartdate;
    private String denddate;
    private String iquantity;
    private String itotalqty;

    public String getCgroupname() {
        return cgroupname;
    }

    public void setCgroupname(String cgroupname) {
        this.cgroupname = cgroupname;
    }

    private String cgroupname;

    public String getItotalqty() {
        return itotalqty;
    }

    public void setItotalqty(String itotalqty) {
        this.itotalqty = itotalqty;
    }

    public String getIdayqty() {
        return idayqty;
    }

    public void setIdayqty(String idayqty) {
        this.idayqty = idayqty;
    }

    private String idayqty;
    private String ccode;
    private String cname;
    private  String ccompanyname;
    private String icjqty;

    public static Creator<Data> getCREATOR() {
        return CREATOR;
    }

    public String getIcjqty() {
        return icjqty;
    }

    public void setIcjqty(String icjqty) {
        this.icjqty = icjqty;
    }

    public String getIscqty() {
        return iscqty;
    }

    public void setIscqty(String iscqty) {
        this.iscqty = iscqty;
    }

    public String getIbzqty() {
        return ibzqty;
    }

    public void setIbzqty(String ibzqty) {
        this.ibzqty = ibzqty;
    }

    private String iscqty;
    private String ibzqty;


    public Data() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cinvcode);
        dest.writeString(this.cinvname);
        dest.writeString(this.dstartdate);
        dest.writeString(this.denddate);
        dest.writeString(this.iquantity);
        dest.writeString(this.itotalqty);
        dest.writeString(this.cgroupname);
        dest.writeString(this.idayqty);
        dest.writeString(this.ccode);
        dest.writeString(this.cname);
        dest.writeString(this.ccompanyname);
    }

    protected Data(Parcel in) {
        this.cinvcode = in.readString();
        this.cinvname = in.readString();
        this.dstartdate = in.readString();
        this.denddate = in.readString();
        this.iquantity = in.readString();
        this.itotalqty = in.readString();
        this.cgroupname = in.readString();
        this.idayqty = in.readString();
        this.ccode = in.readString();
        this.cname = in.readString();
        this.ccompanyname = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}
