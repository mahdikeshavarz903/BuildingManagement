package com.creativedevelopers.buildingmanagement.Model;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mahdi on 2/14/18.
 */

public class Owner
{
   private String name ;
   private String phoneNumber;
   private int id;
   private int members_num;
   private int isManager;

    public Owner(String ownerName,String ownerPhone)
    {
        this.name = ownerName;
        this.phoneNumber = ownerPhone;
    }
    public Owner()
    {}

    public int getMembers_num() {
        return members_num;
    }

    public int getIsManager() {
        return isManager;
    }

    public void setIsManager(int isManager) {
        this.isManager = isManager;
    }

    public void setMembers_num(int members_num) {
        this.members_num = members_num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
