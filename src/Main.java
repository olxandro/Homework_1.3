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
        System.out.println();

        System.out.println("Какое время года?");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца - ");
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
            default:
                System.out.println(" В году только 12 месяцев!!!");
        }
        System.out.println();

        //task4

        /*
        Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам, чтобы вы
        оценили свои силы.Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без
        остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.Если число делится без остатка и
        на 3, и на 5, необходимо вывести ping pong.Допускается наличие пустых строк в выводе.
         */
        System.out.println("Игра в пинг-понг!");
        for (int i = 1; i <= 30 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }
        System.out.println();

        //task5
        /*
        Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:– Каждое
        следующее число равняется сумме двух предыдущих.Дано: две целочисленные переменные, первая равна 0, вторая равна
        1.Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.Должно получиться
        следующее:0 1 1 2 3 5 8 13 21 34СправкаЧисла Фибоначчи – элементы числовой последовательности
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
        в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел. Названы
        в честь средневекового математика Леонардо Пизанского.
         */

        System.out.println("Числа Фибоначчи!");
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int count = 10;
        for (int i = 2; i <= count ; i++) {
            int fibonacci = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci;
            System.out.print(fibonacci + " ");
        }
    }
}