package com.company;

public class Main<DeliveryDistance> {

    public static void main(String[] args) {

        int clientOs = 0;
        System.out.println("Устнаовите версию приложения для Ios по ссылке ");

        int clientAndroid = 1;
        System.out.println("Установите версию приложения для Android по ссылке");


        int clientOnDeviceYearIos = 2015;

        if (clientOnDeviceYearIos <= 2015) {
            System.out.println("Установите облегченную версию для Ios по ссылке ");

        } else {
            System.out.println(" Установите обычную версию для Ios");
        }

        int clientOnDeviceYearAndroid = 2015;

        if (clientOnDeviceYearAndroid <= 2015) {
            System.out.println("Установите облегченную версию для Android");

        } else {
            System.out.println("Установите обычную версию для Android");
        }
        int year = 2021;
        boolean isNotLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println("не високосный год " + year);

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) ;
        {
            System.out.println("доставка занимает сутки");
            if (deliveryDistance > 60) ;
            System.out.println("Доставка занимает двое суток");
        }
        if (deliveryDistance < 100) ;
        System.out.println("доставка занимает трое суток");


        int month = 12;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:season  = "зима";break;
            case 3:
            case 4:
            case 5:season = "весна";break;
            case 6:
            case 7:
            case 8:season = "лето";break;
            case 9:
            case 10:
            case 11:season="осень";break;
            default:season = "ошибка" + (month>13);
        }
    System.out.println(season);

    }

}
