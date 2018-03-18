package com.creativedevelopers.buildingmanagement.Unit_Test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.creativedevelopers.buildingmanagement.Model.Apartment;
import com.creativedevelopers.buildingmanagement.Model.Building;
import com.creativedevelopers.buildingmanagement.Model.DataBase;
import com.creativedevelopers.buildingmanagement.Model.Owner;
import com.creativedevelopers.buildingmanagement.R;

/**
 * Created by Mahdi on 3/18/18.
 */

public class Mahdi extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mahdi);

        Building building=new Building();
        building.setBuildingName("shahab parvaz");
        building.setBuildingManagerName("Reza");
        building.setNumberOfBuildingUnits(50);

//        Owner owner=new Owner("Mahdi","09198025037");
//
//        Apartment apartment=new Apartment();
//        apartment.setApartmentNumber(3);
//        apartment.setMembers_num(5);
//        apartment.setOwner(owner);

        DataBase dataBass=new DataBase(Mahdi.this);
        dataBass.getReadableDatabase();

        dataBass.getBuildingInformation();

//        dataBass.addManagmentForBuilding(apartment);
//        dataBass.addBuilding(building);
//        System.out.println(result);
    }

}
