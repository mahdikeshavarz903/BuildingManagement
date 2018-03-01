package com.creativedevelopers.buildingmanagement.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.creativedevelopers.buildingmanagement.Model.Apartment;
import com.creativedevelopers.buildingmanagement.Model.Building;
import com.creativedevelopers.buildingmanagement.Model.DataBase;
import com.creativedevelopers.buildingmanagement.Model.Owner;
import com.creativedevelopers.buildingmanagement.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Building building=new Building();
        building.setBuildingName("Shamsol emare");
        building.setBuildingManagerName("ALI");
        building.setNumberOfBuildingUnits(5);
//        Apartment apartment=new Apartment();
//        apartment.setApartmentNumber(3);
//        apartment.setMembers_num(5);

//        Owner owner=new Owner("Mahdi","09198025037");
        DataBase dataBass=new DataBase(MainActivity.this);
        dataBass.getReadableDatabase();
         //boolean result=dataBass.addBuilding(building);
        //boolean result=dataBass.addApartment(apartment,owner);
        //System.out.println(result);
    }

    public void test()
    {
        
    }
}
