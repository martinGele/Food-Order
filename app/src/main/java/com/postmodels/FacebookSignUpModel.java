package com.postmodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacebookSignUpModel {

    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("first_name")
    @Expose
    public String first_name;
    @SerializedName("android_id")
    @Expose
    public String android_id;
    @SerializedName("dob_day")
    @Expose
    public int dob_day;
    @SerializedName("dob_month")
    @Expose
    public int dob_month;
    @SerializedName("dob_year")
    @Expose
    public int dob_year;
    @SerializedName("latitude")
    @Expose
    public String latitude;
    @SerializedName("longitude")
    @Expose
    public String longitude;
    @SerializedName("register_device_type")
    @Expose
    public String register_device_type;
    @SerializedName("register_type")
    @Expose
    public String register_type;
    @SerializedName("appkey")
    @Expose
    public String appkey;
    @SerializedName("referral_code")
    @Expose
    public String referral_code;
    @SerializedName("device_id")
    @Expose
    public String device_id;
    @SerializedName("device_token")
    @Expose
    public String device_token;
    @SerializedName("phone_model")
    @Expose
    public String phone_model;
    @SerializedName("os")
    @Expose
    public String os;
    @SerializedName("marketing_optin")
    @Expose
    public String marketing_optin;
    public String favorite_menu_item;
    public String validate_account;


    public FacebookSignUpModel(String email, String first_name, String android_id, int dob_day, int dob_month, int dob_year, String latitude, String longitude,
                               String register_device_type, String register_type, String appkey, String referral_code, String device_id, String device_token,
                               String phone_model, String os, String marketing_optin, String favorite_menu_item, String validate_account) {
        this.email = email;
        this.first_name = first_name;
        this.android_id = android_id;
        this.dob_day = dob_day;
        this.dob_month = dob_month;
        this.dob_year = dob_year;
        this.latitude = latitude;
        this.longitude = longitude;
        this.register_device_type = register_device_type;
        this.register_type = register_type;
        this.appkey = appkey;
        this.referral_code = referral_code;
        this.device_id = device_id;
        this.device_token = device_token;
        this.phone_model = phone_model;
        this.os = os;
        this.marketing_optin = marketing_optin;
        this.favorite_menu_item = favorite_menu_item;
        this.validate_account = validate_account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getAndroid_id() {
        return android_id;
    }

    public void setAndroid_id(String android_id) {
        this.android_id = android_id;
    }

    public int getDob_day() {
        return dob_day;
    }

    public void setDob_day(int dob_day) {
        this.dob_day = dob_day;
    }

    public int getDob_month() {
        return dob_month;
    }

    public void setDob_month(int dob_month) {
        this.dob_month = dob_month;
    }

    public int getDob_year() {
        return dob_year;
    }

    public void setDob_year(int dob_year) {
        this.dob_year = dob_year;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRegister_device_type() {
        return register_device_type;
    }

    public void setRegister_device_type(String register_device_type) {
        this.register_device_type = register_device_type;
    }

    public String getRegister_type() {
        return register_type;
    }

    public void setRegister_type(String register_type) {
        this.register_type = register_type;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getReferral_code() {
        return referral_code;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getDevice_token() {
        return device_token;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }

    public String getPhone_model() {
        return phone_model;
    }

    public void setPhone_model(String phone_model) {
        this.phone_model = phone_model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMarketing_optin() {
        return marketing_optin;
    }

    public void setMarketing_optin(String marketing_optin) {
        this.marketing_optin = marketing_optin;
    }

    public String getFavorite_menu_item() {
        return favorite_menu_item;
    }

    public void setFavorite_menu_item(String favorite_menu_item) {
        this.favorite_menu_item = favorite_menu_item;
    }


}
