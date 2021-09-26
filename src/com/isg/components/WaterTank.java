package com.isg.components;

public class WaterTank{
    public double waterTankMaxVolume;
    public double waterTankCurrentVolume;

    public WaterTank(double waterTankMaxVolume){
        this.waterTankMaxVolume=waterTankMaxVolume;
        this.waterTankCurrentVolume=waterTankMaxVolume;
    }

    public void waterConsumption(double portion){
        waterTankCurrentVolume-=portion;

    }

    public void waterFilling(){
        waterTankCurrentVolume=waterTankMaxVolume;

    }

    public double getWaterTankCurrentVolume() {
        return waterTankCurrentVolume;

    }

}
