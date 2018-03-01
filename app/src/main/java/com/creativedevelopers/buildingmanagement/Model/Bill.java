package com.creativedevelopers.buildingmanagement.Model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by jolan on 2/14/18.
 */

public abstract class Bill
{
    /* Bill is subclass and its chaild is WaterBill,GasBil and Electricity.
        The chailds attributes

     */

    private ArrayList<WaterBill> waterBills = new ArrayList<WaterBill>();
    private ArrayList<GasBill> gasBills = new ArrayList<GasBill>();
    private ArrayList<ElectricityBill> electricityBills = new ArrayList<ElectricityBill>();
    private double earmark_pay;
    private double earmark_bill;
    private String date;
    private double price;
    private int count_of_familys_ship;
    private int count_of_apartement;

    public Bill() {
    }

    public Bill(double price) {
        this.price = price;
    }

    public Bill( double earmark_bill, double earmark_pay){
        this.earmark_bill = earmark_bill;
        this.earmark_pay =  earmark_pay;
    }

    public Bill(double price, double earmark_bill, double earmark_pay){
        this.earmark_bill = earmark_bill;
        this.earmark_pay =  earmark_pay;
        this.price=price;
    }

//-------------------------------------------water bill part --------------------------------------//


    public ArrayList<WaterBill> getWaterBills() {
        return waterBills;
    }

    public void setWaterBills(WaterBill waterBills) {
        this.waterBills.add(waterBills);
    }

    public void addWaterBill(double price,double earmark_bill,double earmark_pay){
        this.waterBills.add(new WaterBill(price,earmark_bill,earmark_pay));
    }


    public void editWaterBill_earmark_bill(int index,double earmarkbill){
        this.waterBills.get(index).setEarmark_bill(earmarkbill);
    }

    public void editWaterBill_earmark_pay(int index,double earmarkpay){
        this.waterBills.get(index).setEarmark_pay(earmarkpay);
    }

    public void editWaterBill_price(int index,double price){
        this.waterBills.get(index).setPrice(price);
    }

    public void deleteWaterBill(int index){
        this.waterBills.remove(index);
    }
//-----------------------------------------------------------------------------------------------//

    //--------------------------------------------gas bill part -------------------------------------------------//

    public ArrayList<GasBill> getGasBills() {
        return gasBills;
    }

    public void setGasBills(GasBill gasBills) {
        this.gasBills.add(gasBills);
    }

    public void addGasBill(double price,double earmark_bill,double earmark_pay){
        this.gasBills.add(new GasBill(price,earmark_bill,earmark_pay));
    }

    public void editGasBill_earmark_bill(int index,double earmarkbill){
        this.gasBills.get(index).setEarmark_bill(earmarkbill);
    }

    public void editGasBill_earmark_pay(int index,double earmarkpay){
        this.gasBills.get(index).setEarmark_pay(earmarkpay);
    }

    public void editGasBill_price(int index,double price){
        this.gasBills.get(index).setPrice(price);
    }

    public void deleteGasBill(int index){
        this.gasBills.remove(index);
    }
    //---------------------------------------electricity bill part--------------------------------------------------//

    public ArrayList<ElectricityBill> getElectricityBills() {
        return electricityBills;
    }

    public void setElectricityBills(ElectricityBill electricityBills) {
        this.electricityBills.add(electricityBills);
    }

    public void addElectricityBill(double price,double earmark_bill,double earmark_pay){
        this.electricityBills.add(new ElectricityBill(price,earmark_bill,earmark_pay));
    }

    public void editElectricityBill_earmark_bill(int index,double earmarkbill){
        this.electricityBills.get(index).setEarmark_bill(earmarkbill);
    }

    public void editElectricityBill_earmark_pay(int index,double earmarkpay){
        this.electricityBills.get(index).setEarmark_pay(earmarkpay);
    }

    public void editElectricityBill_price(int index,double price){
        this.electricityBills.get(index).setPrice(price);
    }

    public void deleteElectricityBill(int index){
        this.electricityBills.remove(index);
    }

    //------------------------------------------------------------------------------------------------------//

    //------------------------------   seters and geters  methods ---------------------------//
    //--------------------------------------------------------------------------------------//
    //-------------------------------------  geters ----------------------------------------//


    public String  getDate() {
        return date;
    }

    public double getEarmark_pay() {
        return earmark_pay;
    }

    public double getEarmark_bill() {
        return earmark_bill;
    }

    public double getPrice() {
        return price;
    }

    public int getCount_of_familys_ship() {
        return count_of_familys_ship;
    }


    public int getCount_of_apartement() {
        return count_of_apartement;
    }

    //***************---- seters -----************************************************//


    public void setDate(String date) {
        this.date = date;
    }

    public void setEarmark_pay(double earmark_pay) {
        this.earmark_pay = earmark_pay;
    }

    public void setEarmark_bill(double earmark_bill) {
        this.earmark_bill = earmark_bill;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    //------------------------------------------------------------------------------------------------//
    /************************* to do *********************************************/

    public void setCount_of_familys_ship(int count_of_familys_ship) {
        this.count_of_familys_ship = count_of_familys_ship;
    }

    /************************* to do *********************************************/
    //------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------//
    /************************* to do *********************************************/

    public void setCount_of_apartement(int count_of_apartement) {
        this.count_of_apartement = count_of_apartement;
    }

    /************************* to do *********************************************/
    //------------------------------------------------------------------------------------------------//

//************************---- calculation totalprice ----**********************************//

    abstract public double calculationExpense();

}
