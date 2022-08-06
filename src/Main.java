import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int prodactionYear = 2014;
        int leapYear = 2021;
        int deliveryDistance = 95;
        int deliveryDays = 0;


        if ( clientOS == 0 && prodactionYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  if (clientOS == 1 && prodactionYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientOS == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (leapYear % 4 == 0 && leapYear % 100 != 0){
        System.out.println(leapYear + " год является високосным!");
        } else if (leapYear % 400 == 0) {
            System.out.println(leapYear + " год является високосным!");
        } else {
            System.out.println(leapYear + " год не является високосным.");
        }

        if (deliveryDistance < 20) {
            deliveryDays += 1;
            System.out.println("Для доставки банковского продукта потребуется " + deliveryDays + " дней!");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 2;
            System.out.println("Для доставки банковского продукта потребуется " + deliveryDays + " дней!");
        } else if (deliveryDistance >= 60 && deliveryDistance < 90) {
            deliveryDays += 3;
            System.out.println("Для доставки банковского продукта потребуется " + deliveryDays + " дней!");
        } else {
            deliveryDays += 4;
            System.out.println("Для доставки банковского продукта потребуется от " + deliveryDays + " дней! За " +
                    " подробной информацией обращайтесь по номеру телефона 888005555050.");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца - \n");
        int monthNumber = in.nextInt();

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("На дворе Зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("На дворе Весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("На дворе лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("На дворе Осень");
                break;
        }


    }
}