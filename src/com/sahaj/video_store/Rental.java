package com.sahaj.video_store;

public class Rental extends DomainObject {
  private Tape tape;
  private int daysRented;

  public Rental(Tape tape, int daysRented) {
    this.tape = tape;
    this.daysRented = daysRented;
  }

  public int daysRented() {
    return daysRented;
  }

  public Tape tape() {
    return tape;
  }

    public int frequentRenterPoints() {
        if ((tape().movie().priceCode() == Movie.NEW_RELEASE) && daysRented() > 1) {
            return 2;
        }
        return 1;
    }
}