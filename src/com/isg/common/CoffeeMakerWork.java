package com.isg.common;
import com.isg.components.NavigationBar;

public class CoffeeMakerWork{
    CoffeeMaker coffeeMaker;

    public CoffeeMakerWork(CoffeeMaker coffeeMaker){
        this.coffeeMaker=coffeeMaker;

    }


    public void make_americano(){
        do_drink(CoffeeRecipe.AMERICANO);

    }
    public void make_espresso(){
        do_drink(CoffeeRecipe.ESPRESSO);

    }
    public void make_double_espresso(){
        do_drink(CoffeeRecipe.DOUBLE_ESPRESSO);

    }

    public boolean is_enough_water(CoffeeRecipe drinks){
        return coffeeMaker.waterTank.getWaterTankCurrentVolume()>=drinks.water;

    }

    public boolean is_enough_coffee(CoffeeRecipe drinks){
        return coffeeMaker.coffeeTank.getCoffeeTankCurrentVolume()>=drinks.coffee;

    }

    public void do_drink(CoffeeRecipe drinks){
        if(is_enough_water(drinks)&&is_enough_coffee(drinks)){
            System.out.println("Починаю готувати "+ drinks);
            coffeeMaker.waterTank.waterConsumption(drinks.water);
            coffeeMaker.coffeeTank.coffeeConsumption(drinks.coffee);
            System.out.println("Кава Готова");
        }
        else{
            if(!is_enough_water(drinks)&!is_enough_coffee(drinks)){
                System.out.println("Заповніть бак з водою");
                System.out.println("Заповніть бак з кавою");
            }
            else if(!is_enough_water(drinks)){
                System.out.println("Заповніть бак з водою");
            }
            else if(!is_enough_coffee(drinks)){
                System.out.println("Заповніть бак з кавою");
            }
        }
    }


    public void machineWork(){
        int temp=0;
        do{
            NavigationBar.navigation_bar();
            temp = NavigationBar.userChoice();
            communication(temp);
        }while (temp!=8);
    }



    public void communication(int choice){
        switch (choice){
            case 1:
                System.out.println("Поточний обсяг води "+coffeeMaker.waterTank.getWaterTankCurrentVolume()+"л, кави "+coffeeMaker.coffeeTank.getCoffeeTankCurrentVolume()+"л");
                break;
            case 2:
                make_americano();
                break;
            case 3:
                make_espresso();
                break;
            case 4:
                make_double_espresso();
                break;
            case 5:
                coffeeMaker.waterTank.waterFilling();
                System.out.println("Бак вже заповнений водою");
                break;
            case 6:
                coffeeMaker.coffeeTank.coffeeFilling();
                System.out.println("Бак вже заповнений кавою ");
                break;
            case 7:
                coffeeMaker.showInfo();
                break;
            case 8:
                System.out.println("Вимкнути кавоварку");
                break;
        }
    }

}
