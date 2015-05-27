package com.sahaj.video_store;

/**
 * Created by maheshbr on 23/03/15.
 */
public class ChildrensPriceCode implements PriceCode {
    @Override
    public double charge(int daysRented) {
        double charge = 0;
        if (daysRented > 3)
            charge += (daysRented - 3) * 1.5;
        return charge;
    }
}
