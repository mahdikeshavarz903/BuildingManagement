package com.creativedevelopers.buildingmanagement.Model;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by MohammadMahdi on 2/14/18.
 */

public class generalAccounting extends Bill
{
    public double prehensions()
    {
        ArrayList<GasBill> gasprehension = getGasBills();
        ArrayList<WaterBill> waterprehension = getWaterBills();
        ArrayList<ElectricityBill> electricityprehension = getElectricityBills();
        double sumofprehensions=0;
        for (int i=0;i<gasprehension.size();i++)
        {
            sumofprehensions = sumofprehensions+Double.parseDouble(String.valueOf(gasprehension.get(0)));
        }
        for (int i=0;i<waterprehension.size();i++)
        {
            sumofprehensions =sumofprehensions+Double.parseDouble(String.valueOf(waterprehension.get(0)));
        }
        for (int i=0;i<electricityprehension.size();i++)
        {
            sumofprehensions = sumofprehensions+Double.parseDouble(String.valueOf(electricityprehension.get(0)));
        }
        return sumofprehensions;
    }

    @Override
    public double calculationExpense() {
       return prehensions();
    }

}
