package Inheritance.restaurant;

import java.math.BigDecimal;

class Tea extends HotBeverage{
    public Tea(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
