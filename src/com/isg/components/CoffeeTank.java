package com.isg.components;

public class CoffeeTank{
    public double coffeeTankMaxVolume;
    public double coffeeTankCurrentVolume;

    public CoffeeTank(double coffeeTankMaxVolume){
        this.coffeeTankMaxVolume=coffeeTankMaxVolume;
        this.coffeeTankCurrentVolume=coffeeTankMaxVolume;
    }

    public void coffeeConsumption(double portion){
        coffeeTankCurrentVolume-=portion;

    }

    public void coffeeFilling(){
        coffeeTankCurrentVolume=coffeeTankMaxVolume;

    }

    public double getCoffeeTankCurrentVolume() {
        return coffeeTankCurrentVolume;

    }
}
