package com.isg;
import com.isg.common.CoffeeMakerWork;
import com.isg.components.NavigationBar;
import com.isg.manufacturers.CoffeeMakerBrandOne;
import com.isg.manufacturers.CoffeeMakerBrandTwo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Оберіть одну із двох запропонованих кавоварок");
        System.out.println(
                        "1-Sonic\n" +
                        "2-Pana\n");
        int choice= NavigationBar.userChoice();

        switch (choice) {
            case 1:
                CoffeeMakerBrandOne A=new CoffeeMakerBrandOne(1,1);
                A.showManufacture();
                CoffeeMakerWork coffeeMakerWork1=new CoffeeMakerWork(A);
                coffeeMakerWork1.machineWork();
                break;
            case 2:
                CoffeeMakerBrandTwo B=new CoffeeMakerBrandTwo(2,2);
                B.showManufacture();
                CoffeeMakerWork coffeeMakerWork2=new CoffeeMakerWork(B);
                coffeeMakerWork2.machineWork();
                break;
        }

    }
}
