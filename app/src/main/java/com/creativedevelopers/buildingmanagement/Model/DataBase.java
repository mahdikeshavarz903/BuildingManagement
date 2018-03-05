package com.creativedevelopers.buildingmanagement.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mahdi on 2/15/18.
 */

public class DataBase extends SQLiteOpenHelper
{
    private static final String TAG = "DataBase";

    public static final String DB_NAME="buildingManagement_db";
    public static final int DB_VERSION=1;

    public Context context;


    //Table Name
    public static final String TABLE_APARTMENT ="table_apartment";
    public static final String TABLE_BUILDING ="table_building";
    public static final String TABLE_OWNER="table_owner";
    public static final String TABLE_GAS_BILL="table_gas_bill";
    public static final String TABLE_WATER_BILL="table_water_bill";
    public static final String TABLE_ELECTRICITY_BILL="table_electricity_bill";
    public static final String TABLE_EXTRA_EXPENSES="table_extra_expenses";

    //Table columns
    //For apartment
    public static final String APARTMENT_COL_ID ="col_apartment_id";
    public static final String COL_OWNER="col_owner";
    public static final String COL_BUILDING="col_building";
    public static final String APARTMENT_COL_GAS_COST="apartment_col_gas_cost";
    public static final String APARTMENT_COL_WATER_COST="apartment_col_water_cost";
    public static final String APARTMENT_COL_ELECTRICITY_COST="apartment_col_electricity_cost";
    public static final String COL_DEBT="col_debt";
    public static final String COL_MONTHLY_CHARGE="col_monthly_charge";
    public static final String COL_GAS_PAYMENT_STATUS="col_gas_payment_status";
    public static final String COL_WATER_PAYMENT_STATUS="col_water_payment_status";
    public static final String COL_ELECTRICITY_PAYMENT_STATUS="col_electricity_payment_status";
    public static final String COL_MONTHLY_CHARGE_PAYMENT_STATUS="col_monthly_charge_payment_status";
    public static final String COL_EXTRA_EXPENSES="col_extra_expenses";
    public static final String COL_EXTRA_EXPENSES_PAYMENT_STATUS="col_extra_expenses_payment_status";

    //Table columns
    //For building
    public static final String BUILDING_COL_ID ="col_building_id";
    public static final String BUILDING_COL_NAME="col_building_name";
    public static final String BUILDING_COL_MANAGER_ID ="col_building_manager_id";
    public static final String BUILDING_COL_GAS_BILL="building_col_gas_bill";
    public static final String BUILDING_COL_WATER_BILL="building_col_water_bill";
    public static final String BUILDING_COL_ELECTRICITY_BILL="building_col_electricity_bill";
    public static final String NUMBER_OF_BUILDING_UNITS="number_of_building_units";
    public static final String BUILDING_COL_EXTRA_EXPENSES="building_col_extra_expenses";

    //Table columns
    //For Owner
    public static final String OWNER_COL_ID ="owner_col_id";
    public static final String COL_NAME="col_name";
    public static final String COL_ROOM_NUM="col_room_num";
    public static final String COL_IS_MANAGER="col_is_manager";
    public static final String COL_PHONE_NUMBER="col_phone_number";
    public static final String COL_MEMBERS_NUM="col_members_num";

    //Table columns
    //For Gas Bill
    public static final String GAS_BILL_COL_ID="gas_bill_col_id";
    public static final String COL_GAS_COST="col_gas_cost";
    public static final String COL_DEADLINE_PAY_GAS_COST="col_deadline_pay_gas_cost";
    public static final String GAS_BILL_COL_EARMARK_PAY="gas_bill_col_earmark_pay";

    //Table columns
    //For Water Bill
    public static final String WATER_BILL_COL_ID="water_bill_col_id";
    public static final String COL_WATER_COST="col_water_cost";
    public static final String COL_DEADLINE_PAY_WATER_COST="col_deadline_pay_water_cost";
    public static final String WATER_BILL_COL_EARMARK_PAY="water_bill_col_earmark_pay";

    //Table columns
    //For Electricity Bill
    public static final String ELECTRICITY_BILL_COL_ID="electricity_bill_col_id";
    public static final String COL_ELECTRICITY_COST="col_electricity_cost";
    public static final String COL_DEADLINE_PAY_ELECTRICITY_COST="col_deadline_pay_electricity_cost";
    public static final String ELECTRICITY_BILL_COL_EARMARK_PAY="electricity_bill_col_earmark_pay";

    //Table columns
    //For Extra Expenses
    public static final String EXTRA_EXPENSES_COL_ID="extra_expenses_col_id";
    public static final String EXTRA_EXPENSES_COL_NAME="extra_expenses_col_name";
    public static final String EXTRA_EXPENSES_COL_PRICE="extra_expenses_col_price";
    public static final String EXTRA_EXPENSES_COL_DATE="extra_expenses_col_date";

    public DataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            String SQL_COMMAND_CREATE_BUILDING=" CREATE TABLE IF NOT EXISTS " + TABLE_BUILDING + "(" +
                    BUILDING_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    BUILDING_COL_NAME + " TEXT, " +
                    NUMBER_OF_BUILDING_UNITS + " INTEGER, "+
                    BUILDING_COL_MANAGER_ID + " INTEGER, " +
                    BUILDING_COL_GAS_BILL + " INTEGER, " +
                    BUILDING_COL_WATER_BILL + " INTEGER, " +
                    BUILDING_COL_ELECTRICITY_BILL + " INTEGER, " +
                    BUILDING_COL_EXTRA_EXPENSES + " INTEGER, " +
                    " FOREIGN KEY ( " + BUILDING_COL_MANAGER_ID + " ) REFERENCES " + TABLE_OWNER + "(" + OWNER_COL_ID + ") ,"+
                    " FOREIGN KEY ( " + BUILDING_COL_GAS_BILL + " ) REFERENCES " + TABLE_GAS_BILL + "(" + GAS_BILL_COL_ID + ") ,"+
                    " FOREIGN KEY ( " + BUILDING_COL_WATER_BILL + " ) REFERENCES " + TABLE_WATER_BILL + "(" + WATER_BILL_COL_ID + ") ,"+
                    " FOREIGN KEY ( " + BUILDING_COL_ELECTRICITY_BILL + " ) REFERENCES " + TABLE_ELECTRICITY_BILL + "(" + ELECTRICITY_BILL_COL_ID + ") , "+
                    " FOREIGN KEY ( " + BUILDING_COL_EXTRA_EXPENSES + " ) REFERENCES " + TABLE_EXTRA_EXPENSES + "(" + EXTRA_EXPENSES_COL_ID + ") "+
                    ")"
                    ;

            String SQL_COMMAND_CREATE_OWNER=" CREATE TABLE IF NOT EXISTS " + TABLE_OWNER + "("+
                    OWNER_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                    COL_NAME + " TEXT, " +
                    COL_PHONE_NUMBER + " TEXT, " +
                    COL_IS_MANAGER + "INTEGER DEFAULT 0,"+
                    COL_MEMBERS_NUM + " INTEGER);";

            String SQL_COMMAND_CREATE_PROFILE_FOR_ONE_UNIT=" CREATE TABLE  IF NOT EXISTS " + TABLE_APARTMENT +"(" +
                    APARTMENT_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_OWNER + " INTEGER, " +
                    COL_BUILDING + " INTEGER, "+
                    APARTMENT_COL_GAS_COST + " DOUBLE, " +
                    COL_GAS_PAYMENT_STATUS + " INTEGER DEFAULT 0, " +
                    APARTMENT_COL_WATER_COST + " DOUBLE, " +
                    COL_WATER_PAYMENT_STATUS + " INTEGER DEFAULT 0, " +
                    APARTMENT_COL_ELECTRICITY_COST + " DOUBLE, " +
                    COL_ELECTRICITY_PAYMENT_STATUS + " INTEGER DEFAULT 0, " +
                    COL_DEBT + " DOUBLE, " +
                    COL_EXTRA_EXPENSES + " DOUBLE, " +
                    COL_EXTRA_EXPENSES_PAYMENT_STATUS + " INTEGER DEFAULT 0, " +
                    COL_MONTHLY_CHARGE + " DOUBLE, " +
                    COL_MONTHLY_CHARGE_PAYMENT_STATUS + " INTEGER DEFAULT 0,"+
                    " FOREIGN KEY ( " + COL_OWNER + " ) REFERENCES " + TABLE_OWNER + "(" + OWNER_COL_ID + ") ,"+
                    " FOREIGN KEY ( " + COL_BUILDING + " ) REFERENCES " + TABLE_BUILDING + "(" + BUILDING_COL_ID + ") "+
                    ")"
                    ;

            String SQL_COMMAND_CREATE_GAS_Bill=" CREATE TABLE IF NOT EXISTS " + TABLE_GAS_BILL  + "(" +
                    GAS_BILL_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                    COL_GAS_COST + "DOUBLE," +
                    COL_DEADLINE_PAY_GAS_COST + " TEXT ," +
                    GAS_BILL_COL_EARMARK_PAY + " TEXT); "
                    ;

            String SQL_COMMAND_CREATE_WATER_Bill=" CREATE TABLE IF NOT EXISTS " + TABLE_WATER_BILL  + "(" +
                    WATER_BILL_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                    COL_WATER_COST + "DOUBLE," +
                    COL_DEADLINE_PAY_WATER_COST + " TEXT," +
                    WATER_BILL_COL_EARMARK_PAY + " TEXT); "
                    ;

            String SQL_COMMAND_CREATE_ELECTRICITY_Bill=" CREATE TABLE IF NOT EXISTS " + TABLE_ELECTRICITY_BILL +  "(" +
                    ELECTRICITY_BILL_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                    COL_ELECTRICITY_COST + "DOUBLE," +
                    COL_DEADLINE_PAY_ELECTRICITY_COST + " TEXT," +
                    ELECTRICITY_BILL_COL_EARMARK_PAY + " TEXT); "
                    ;

            String SQL_COMMAND_CREATE_EXTRA_EXPENSES=" CREATE TABLE IF NOT EXISTS " + TABLE_EXTRA_EXPENSES + "(" +
                    EXTRA_EXPENSES_COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT , "+
                    EXTRA_EXPENSES_COL_NAME + " TEXT ," +
                    EXTRA_EXPENSES_COL_PRICE + " DOUBLE ,"+
                    EXTRA_EXPENSES_COL_DATE + " TEXT );"
                    ;

            db.execSQL(SQL_COMMAND_CREATE_BUILDING);
            db.execSQL(SQL_COMMAND_CREATE_OWNER);
            db.execSQL(SQL_COMMAND_CREATE_PROFILE_FOR_ONE_UNIT);
            db.execSQL(SQL_COMMAND_CREATE_GAS_Bill);
            db.execSQL(SQL_COMMAND_CREATE_WATER_Bill);
            db.execSQL(SQL_COMMAND_CREATE_ELECTRICITY_Bill);
            db.execSQL(SQL_COMMAND_CREATE_EXTRA_EXPENSES);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BUILDING);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OWNER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_APARTMENT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GAS_BILL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WATER_BILL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ELECTRICITY_BILL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EXTRA_EXPENSES);
        onCreate(db);
    }
    //**********************************************************************************************
    public void addManagmentForBuilding(Apartment apartment)
    {
        String sql_command_insert = " insert into table_apartment ( " + COL_NAME + " , " +
            COL_PHONE_NUMBER + " , " +
            COL_IS_MANAGER + " , " +
            COL_MEMBERS_NUM +
            ") values ( ' " + apartment.getOwner().getName() + " ' , ' "  + apartment.getOwner().getPhoneNumber() +" ' , ' 1 ' , ' " +
            apartment.getMembers_num() + " ' );"
            ;

        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

        try {
            sqLiteDatabase.execSQL(sql_command_insert);
        }
        catch (Exception e)
        {
            Log.i(TAG, "addBuilding: " + e);
        }

    }
    //**********************************************************************************************
    public void addBuilding(Building building)
    {
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();

        String sql_command_insert=" insert into " + TABLE_BUILDING + " ( " +
            BUILDING_COL_NAME + "," +
            NUMBER_OF_BUILDING_UNITS +
            " ) values (' " + building.getBuildingName() + " ' , ' " + building.getNumberOfBuildingUnits() + " ' ); "
            ;

        try {
            sqLiteDatabase.execSQL(sql_command_insert);
        }
        catch (Exception e)
        {
            Log.i(TAG, "addBuilding: " + e);
        }
    }

//    public boolean addBuilding(Building building)
//    {
//        ContentValues cv = new ContentValues();
////        cv.put(BUILDING_COL_NAME,building.getBuildingName());
////        cv.put(BUILDING_COL_MANAGER_ID, building.getBuildingManagerName());
////        cv.put(NUMBER_OF_BUILDING_UNITS,building.getNumberOfBuildingUnits());
////        cv.put(BUILDING_COL_GAS_COST,0);
////        cv.put(COL_DEADLINE_PAY_GAS_COST,0);
////        cv.put(BUILDING_COL_WATER_COST,0);
////        cv.put(COL_DEADLINE_PAY_WATER_COST,0);
////        cv.put(BUILDING_COL_ELECTRICITY_COST,0);
////        cv.put(COL_DEADLINE_PAY_ELECTRICITY_COST,0);
////        cv.put(COL_ACTIVITY_NAME,"");
////        cv.put(COL_ACTIVITY_PRICE,0);
//
//        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
//        long isInsert=sqLiteDatabase.insert(TABLE_BUILDING,null,cv);
//
//        if (isInsert>0)
//            return true;
//        else
//            return false;
//    }
    //**********************************************************************************************
    public Building getBuildingInformation()
    {
        Building building=new Building();

        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_BUILDING,null);

        cursor.moveToNext();

        if(cursor.getCount()>0)
        {
            while (!cursor.isAfterLast()) {
                building.setId(cursor.getInt(0));
                building.setBuildingName(cursor.getString(1));
                building.setBuildingManagerName(cursor.getString(2));
                building.setNumberOfBuildingUnits(cursor.getInt(3));
                cursor.moveToNext();
            }
        }

        cursor.close();
        sqLiteDatabase.close();

        return building;
    }
}
