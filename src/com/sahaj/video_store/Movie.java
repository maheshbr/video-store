package com.sahaj.video_store;

public class Movie extends DomainObject {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private PriceCode priceCode;

  public Movie(String name, PriceCode priceCode) {
    this.name = name;
    this.priceCode = priceCode;
  }

  public PriceCode priceCode() {
    return priceCode;
  }

  public void persist() {
    Registrar.add("Movies", this);
  }

  public static Movie get(String name) {
    return (Movie) Registrar.get("Movies", name);
  }

    public double charge(Rental rental) {
        return priceCode.charge(5);

        /*double charge = 0;

        //determine amounts for rental line
        switch (priceCode()) {
          case REGULAR:
            charge += 2;
            if (rental.daysRented() > 2)
              charge += (rental.daysRented() - 2) * 1.5;
            break;
          case NEW_RELEASE:
            charge += rental.daysRented() * 3;
            break;
          case CHILDRENS:
            charge += 1.5;
            if (rental.daysRented() > 3)
              charge += (rental.daysRented() - 3) * 1.5;
            break;

        }
        return charge;
    }*/
    }
}
