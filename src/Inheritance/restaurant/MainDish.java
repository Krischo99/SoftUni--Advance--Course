package Inheritance.restaurant;

import java.math.BigDecimal;

class MainDish extends Food{
    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
