package com.creativedevelopers.buildingmanagement.Model;

/**
 * Created by Jolan on 2/14/18.
 */

public class WaterBill extends Bill
{


//-------------------------Constructors---------------------------//

    public WaterBill(double price, double earmark_bill, double earmark_pay) {
        super(price, earmark_bill, earmark_pay);
    }

    public WaterBill(double price) {
        super(price);
    }

    public WaterBill(double earmark_bill, double earmark_pay) {
        super(earmark_bill, earmark_pay);
    }

//***************************************************************************//

    // ---------------------------   calculation ----------------------//
    @Override
    public double calculationExpense() {
    return this.getPrice()/this.getCount_of_familys_ship();
    }

}
