
package com.reklamar.testpandora.classes.userauth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserResponse {

    @SerializedName("stat")
    @Expose
    private String stat;
    @SerializedName("result")
    @Expose
    private User user;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("code")
    @Expose
    private String code;

    public String getMessage() {
        if(message != null){
            return message;
        }else {
            return "";
        }
    }

    public String getCode() {
        if(code != null){
            return code;
        }else {
            return "";
        }
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
