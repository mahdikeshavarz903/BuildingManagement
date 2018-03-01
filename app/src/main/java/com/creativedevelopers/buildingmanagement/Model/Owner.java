package com.creativedevelopers.buildingmanagement.Model;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mahdi on 2/14/18.
 */

public class Owner
{
   private String name ;
   private String phoneNumber;

    public Owner(String ownerName,String ownerPhone)
    {
        this.name = ownerName;
        this.phoneNumber = ownerPhone;
    }
    public Owner()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
