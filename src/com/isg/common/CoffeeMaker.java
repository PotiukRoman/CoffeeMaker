package com.isg.common;

import com.isg.components.CoffeeTank;
import com.isg.components.NavigationBar;
import com.isg.components.WaterTank;

public abstract class CoffeeMaker {
    public WaterTank waterTank;
    public CoffeeTank coffeeTank;
    public NavigationBar navigationBar;

    public CoffeeMaker(double waterTankMaxVolume,double coffeeTankMaxVolume){
        waterTank=new WaterTank(waterTankMaxVolume);
        coffeeTank=new CoffeeTank(coffeeTankMaxVolume);
        navigationBar=new NavigationBar();
    }

    public abstract void showManufacture();

    public abstract void showInfo();

}
