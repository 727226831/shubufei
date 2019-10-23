package com.example.shubufei;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.shubufei.bean.Data;

import java.util.ArrayList;
import java.util.List;

public class DataBean implements Parcelable {


        private String Resultcode;
        private String ResultMessage;
        private List<Data> data;
        public void setResultcode(String Resultcode) {
            this.Resultcode = Resultcode;
        }
        public String getResultcode() {
            return Resultcode;
        }

        public void setResultMessage(String ResultMessage) {
            this.ResultMessage = ResultMessage;
        }
        public String getResultMessage() {
            return ResultMessage;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }
        public List<Data> getData() {
            return data;
        }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Resultcode);
        dest.writeString(this.ResultMessage);
        dest.writeList(this.data);
    }

    public DataBean() {
    }

    protected DataBean(Parcel in) {
        this.Resultcode = in.readString();
        this.ResultMessage = in.readString();
        this.data = new ArrayList<Data>();
        in.readList(this.data, Data.class.getClassLoader());
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
