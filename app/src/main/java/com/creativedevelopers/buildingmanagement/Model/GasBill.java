package com.creativedevelopers.buildingmanagement.Model;

/**
 * Created by Mahdi on 2/14/18.
 */

public class GasBill extends Bill
{


//-------------------------Constructors---------------------------//

    public GasBill(double price) {
        super(price);
    }

    public GasBill(double earmark_bill, double earmark_pay) {
        super(earmark_bill, earmark_pay);
    }

    public GasBill(double price, double earmark_bill, double earmark_pay) {
        super(price, earmark_bill, earmark_pay);
    }

//***************************************************************************//

    // ---------------------------   calculation ----------------------//
    @Override
    public double calculationExpense() {

        return this.getPrice()/this.getCount_of_apartement();
    }
}
