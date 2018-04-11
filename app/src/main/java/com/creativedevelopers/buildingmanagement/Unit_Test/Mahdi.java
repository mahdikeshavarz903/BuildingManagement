package com.creativedevelopers.buildingmanagement.Unit_Test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import com.creativedevelopers.buildingmanagement.R;
import com.creativedevelopers.buildingmanagement.Fragment.UnitManagement;
import com.creativedevelopers.buildingmanagement.Fragment.UnitsDetail;
import com.creativedevelopers.buildingmanagement.Model.Apartment;
import com.creativedevelopers.buildingmanagement.Model.Building;
import com.creativedevelopers.buildingmanagement.Model.DataBase;
import com.creativedevelopers.buildingmanagement.Model.Owner;

import javax.annotation.Resource;

/**
 * Created by Mahdi on 3/18/18.
 */

public class Mahdi extends AppCompatActivity
{
    private android.support.v7.widget.Toolbar toolbar;
    private FloatingActionButton floatingActionButton;
    private static FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    public static FragmentManager fragmentManager() {
        return fragmentManager;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mahdi);

//        String[] name={"Mahdi","Ali","Sajad","Hosein","Saeid"};
//        String[] phoneNum={"09122390342","09198025037","09382858823","093312345678","09127130445"};
//        int[] roomNum={1,2,3,4,5};
//        int[] waterState={1,0,1,1,0};
//        int[] electricityStatus={1,1,1,1,1};
//        int[] gasState={0,0,1,1,0};
//        boolean[] monthlyCharge={true,true,false,false,false};

        DataBase dataBass=new DataBase(Mahdi.this);
        dataBass.getReadableDatabase();

        fragmentManager = getFragmentManager();

        unitManagement();

        Toolbar toolbar=findViewById(R.id.unitManagement_toolbar);
        setSupportActionBar(toolbar);

        floatingActionButton=findViewById(R.id.floatingActionButton);

//        Building building=new Building();
//        building.setBuildingName("shahab parvaz");
//        building.setBuildingManagerName("Sajad");
//        building.setNumberOfBuildingUnits(50);
//
//
//        for(int i=0;i<5;i++)
//        {
//            Owner owner = new Owner(name[i], phoneNum[i]);
//
//            owner.setMembers_num(3);
//            owner.setIsManager(0);
//
//            dataBass.addOwner(owner);
//        }
//
//
//        for(int i=0;i<5;i++)
//        {
//            Apartment apartment = new Apartment();
//            apartment.setApartmentNumber(roomNum[i]);
//            apartment.setWaterStatus(waterState[i]);
//            apartment.setElectricityStatus(electricityStatus[i]);
//            apartment.setGasStatus(gasState[i]);
//            apartment.setIs_monthlyCharge_payed(monthlyCharge[i]);
//
//            dataBass.addApartment(apartment,i+1,0);
//        }


//        dataBass.getOwnerInformaiton();
//
//        dataBass.addManagmentForBuilding(apartment);
//        dataBass.addBuilding(building);
//        System.out.println(result);



    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    public void unitManagement()
    {
        UnitManagement unitManagement = new UnitManagement();

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.mahdi_relativeLayout, unitManagement).commit();
    }

}
