package com.isg.common;

public enum CoffeeRecipe {
    AMERICANO(0.5,0.2),
    ESPRESSO(0.2,0.2),
    DOUBLE_ESPRESSO(0.4,0.4);

    public double water;
    public double coffee;

    CoffeeRecipe(double water,double coffee){
        this.water=water;
        this.coffee=coffee;
    }
}


