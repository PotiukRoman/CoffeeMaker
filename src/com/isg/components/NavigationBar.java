package com.isg.components;
import java.util.Scanner;

public class NavigationBar {
    public static String userChoice;
    public static int choice;

    public static int userChoice(){
        Scanner input=new Scanner(System.in);
        System.out.println("Зробіть ваш вибір --->");
        userChoice=input.nextLine();
        choice=Integer.parseInt(userChoice);
        return choice;
    }


    public static void navigation_bar(){
        System.out.println("Меню кавоварки");
        System.out.println(
                "1-Показати поточний обсяг води і кави\n" +
                        "2-Приготувати \"Американо\"\n" +
                        "3-Приготувати \"Еспрессо\"\n" +
                        "4-Приготувати \"Подвійний еспресо\"\n" +
                        "5-Заповнити бак з водою\n" +
                        "6-Заповнити бак з кавою\n" +
                        "7-Інформація\n" +
                        "8-Вимкнути кавоварку\n");
    }
}
