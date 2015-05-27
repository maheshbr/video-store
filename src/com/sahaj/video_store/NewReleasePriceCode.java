package com.sahaj.video_store;

/**
 * Created by maheshbr on 23/03/15.
 */
public class NewReleasePriceCode implements PriceCode {
    @Override
    public double charge(int daysRented) {
        double charge = 2;
        if(daysRented > 2) {
            charge += daysRented * 3;
        }
        return charge;
    }
}
