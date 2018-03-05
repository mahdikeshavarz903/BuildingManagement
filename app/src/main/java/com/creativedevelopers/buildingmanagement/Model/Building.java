package com.creativedevelopers.buildingmanagement.Model;

import java.util.ArrayList;

/**
 * Created by Mahdi on 2/14/18.
 */

public class Building
{
    private String buildingName;
    private String buildingManagerName;
    private int numberOfBuildingUnits;
    private int id;
    private ArrayList<Apartment> apartments;
    private generalAccounting GeneralAccounting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //**********************************************************************************************
    public int getNumberOfBuildingUnits() {
        return numberOfBuildingUnits;
    }

    public void setNumberOfBuildingUnits(int numberOfBuildingUnits) {
        this.numberOfBuildingUnits = numberOfBuildingUnits;
    }
    //**********************************************************************************************
    public String getBuildingManagerName() {
        return buildingManagerName;
    }

    public void setBuildingManagerName(String buildingManagerName) {
        this.buildingManagerName = buildingManagerName;
    }
    //**********************************************************************************************
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    //**********************************************************************************************
    public  int getNumberOfApartments() {
        return apartments.size();
    }
    //**********************************************************************************************
    public void addNewApartment(String OwnerName, String OwnerPhoneNumber,int MembersNum ,int ApartmentNum)
    {
        Apartment newApartment = new Apartment();
        newApartment.setApartmentNumber(ApartmentNum);
        newApartment.owner.setName(OwnerName);
        newApartment.owner.setPhoneNumber(OwnerPhoneNumber);
        newApartment.setMembers_num(MembersNum);
        apartments.add(newApartment);
    }
    //**********************************************************************************************
    public Apartment getSpecificApartmentInfo(int ApartmentNum)
    {
        Apartment temp = new Apartment();
        for(int i=0;i<apartments.size();i++)
           if (apartments.get(i).getApartmentNumber()==ApartmentNum)
                temp = apartments.get(i);
        return temp;
    }
    //**********************************************************************************************
    public Apartment getSpecificApartmentInfo(String ApartmentOwnerName)
    {
        Apartment temp = new Apartment();
        for (int i=0;i<apartments.size();i++)
            if (apartments.get(i).owner.getName()==ApartmentOwnerName)
                temp = apartments.get(i);
        return temp;
    }

    
}

