package com.creativedevelopers.buildingmanagement.Model;

/**
 * Created by Jolan on 2/14/18.
 */

public class ElectricityBill extends Bill
{


//-------------------------Constructors---------------------------//

    public ElectricityBill(double price) {
        super(price);
    }

    public ElectricityBill(double earmark_bill, double earmark_pay) {
        super(earmark_bill, earmark_pay);
    }

    public ElectricityBill(double price, double earmark_bill, double earmark_pay) {
        super(price, earmark_bill, earmark_pay);
    }

//***************************************************************************//

    // ---------------------------   calculation ----------------------//
    @Override
    public double calculationExpense() {
        return this.getPrice()/this.getCount_of_apartement();
    }

}
