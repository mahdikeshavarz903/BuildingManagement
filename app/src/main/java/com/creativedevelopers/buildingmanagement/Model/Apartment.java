package com.creativedevelopers.buildingmanagement.Model;

import java.util.ArrayList;

/**
 * Created by Mahdi on 2/14/18.
 */

public class Apartment
{
   Owner owner;
   ArrayList<Bill> bills;
   private int members_num;
   private boolean is_monthlyCharge_payed;
   private boolean is_specificBill_payed;
   private int ApartmentNumber;

    public Owner getOwner() {
        return owner;
    }

    public int getMembers_num() {
        return members_num;
    }

    public int getApartmentNumber() {
        return ApartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        ApartmentNumber = apartmentNumber;
    }

    public void setMembers_num(int members_num) {
        this.members_num = members_num;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean is_monthlyCharge_payed() {
        return is_monthlyCharge_payed;
    }

    public void setIs_monthlyCharge_payed(boolean is_monthlyCharge_payed) {
        this.is_monthlyCharge_payed = is_monthlyCharge_payed;
    }

    public boolean is_specificBill_payed() {
        return is_specificBill_payed;
    }

    public void setIs_specificBill_payed(boolean is_specificBill_payed) {
        this.is_specificBill_payed = is_specificBill_payed;
    }
}
