package com.example.icbc;

import android.os.Parcel;
import android.os.Parcelable;

public class DataBean implements Parcelable {

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode;
    }

    private String cinvcode;
    private String cinvname;
    private String dstartdate;
    private String denddate;
    private String iquantity;
    private String itotalqty;
    private String idayqty;
    private String ccode;
    private String cname;
    private  String ccompanyname;

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



        public void setCinvname(String cinvname) {
            this.cinvname = cinvname;
        }
        public String getCinvname() {
            return cinvname;
        }

        public void setDstartdate(String dstartdate) {
            this.dstartdate = dstartdate;
        }
        public String getDstartdate() {
            return dstartdate;
        }

        public void setDenddate(String denddate) {
            this.denddate = denddate;
        }
        public String getDenddate() {
            return denddate;
        }

        public void setIquantity(String iquantity) {
            this.iquantity = iquantity;
        }
        public String getIquantity() {
            return iquantity;
        }

        public void setItotalqty(String itotalqty) {
            this.itotalqty = itotalqty;
        }
        public String getItotalqty() {
            return itotalqty;
        }

        public void setIdayqty(String idayqty) {
            this.idayqty = idayqty;
        }
        public String getIdayqty() {
            return idayqty;
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
        dest.writeString(this.idayqty);
        dest.writeString(this.ccode);
        dest.writeString(this.cname);
        dest.writeString(this.ccompanyname);
    }

    public DataBean() {
    }

    protected DataBean(Parcel in) {
        this.cinvcode = in.readString();
        this.cinvname = in.readString();
        this.dstartdate = in.readString();
        this.denddate = in.readString();
        this.iquantity = in.readString();
        this.itotalqty = in.readString();
        this.idayqty = in.readString();
        this.ccode = in.readString();
        this.cname = in.readString();
        this.ccompanyname = in.readString();
    }

    public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() {
        @Override
        public DataBean createFromParcel(Parcel source) {
            return new DataBean(source);
        }

        @Override
        public DataBean[] newArray(int size) {
            return new DataBean[size];
        }
    };
}
