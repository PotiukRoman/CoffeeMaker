package com.isg.manufacturers;
import com.isg.common.CoffeeMaker;

public class CoffeeMakerBrandOne extends CoffeeMaker {
    public String manufacture="Sonic";
    double waterTankMaxVolume;
    double coffeeTankMaxVolume;

    public CoffeeMakerBrandOne(double waterTankMaxVolume,double coffeeTankMaxVolume){
        super(waterTankMaxVolume,coffeeTankMaxVolume);
        this.waterTankMaxVolume=waterTankMaxVolume;
        this.coffeeTankMaxVolume=coffeeTankMaxVolume;

    }

    public void showManufacture(){
        System.out.println("Обрано кавоварку "+manufacture);
    }

    public void showInfo(){
        String information="Виробник кавоварки: " +manufacture+ ", має обєм баку для води "+waterTankMaxVolume+"л, та обєм баку для кави " + coffeeTankMaxVolume+"л";
        System.out.println(information);

    }
}
