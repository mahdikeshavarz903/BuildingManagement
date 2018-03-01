package com.creativedevelopers.buildingmanagement.Model;

import android.support.v7.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by MohammadMahdi on 2/14/18.
 */

    public class BuildingActivity
    {
        String name;
        double price;
        String Time;

        public BuildingActivity(String name, double price, String Time) {
            this.name = name;
            this.price = price;
            this.Time = Time;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getTime() {
            return Time;
        }
        static ArrayList<BuildingActivity> activities = new ArrayList<>();

        public void add_buildingAcitivity(String name, double price) {
            Calendar c = Calendar.getInstance();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String datetime = dateformat.format(c.getTime());
            activities.add(new BuildingActivity(name, price, datetime));
        }

        public void edit_buildingAcitivity(String name, double price) {
            //Alan esme oon chizi ke click mishe roosh ro chejoori begiram?!
        }

        public void delete_buildingAcitivity(String name) {
//        int deleteindex=activities.indexOf(name);
            for (int i = 0; i < activities.size(); i++) {
                if (name.equals(activities.get(i).getName())) {
//                System.out.println(activities.get(i).getName());
                    activities.remove(i);
                }
            }
    }
    class anotheractivities {


//        activities.remove(deleteindex);
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:mm");
//        String datetime = dateformat.format(c.getTime());
//        System.out.println(datetime);
    }

//    public static void main(String[] args) {
//        System.out.println("Mohammad");
//        add_anotheractivity("Elevator", 1000);
//        add_anotheractivity("Chief", 200);
//        add_anotheractivity("Sar_chief", 500);
//        delete_anotheractivity("Chief");
//        System.out.println(activities.get(0).getName());
//        System.out.println(activities.get(1).getName());
////        System.out.println(activities.get(2).getName());
//    }
}
