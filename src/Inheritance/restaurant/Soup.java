package Inheritance.restaurant;

import java.math.BigDecimal;

class Soup extends Starter{
    public Soup(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}