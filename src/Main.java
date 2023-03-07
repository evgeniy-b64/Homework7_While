public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
       /* task9();
        task10();*/
    }

    public static void task1() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1: Накопить 2459000 р. ||");
        System.out.println(separator);
        int sum = 0;
        int monthlySaving = 15000;
        short monthsCount =0;
        while (sum< 2459000){
            sum = sum + monthlySaving;
            monthsCount++;
            System.out.println("Месяц "+monthsCount+", сумма накоплений равна "+sum+" рублей");
        }

    }

    public static void task2() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2: Числа 1..10 и 10..1 ||");
        System.out.println(separator);
        int i=0;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void task3() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3: Рождаемость ||");
        System.out.println(separator);
        int bithtRate = 17;
        int deathRate = 8;
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++){
            population = population + (bithtRate-deathRate)*population/1000;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
    }

    public static void task4() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4: Вася копит деньги под 7% ||");
        System.out.println(separator);
        byte percent = 7;
        short monthsCount =0;
        int sum = 15000;
        while (sum <12_000_000){
            sum = sum+sum*percent/100;
            monthsCount++;
            System.out.println("Месяц "+monthsCount+", сумма накоплений равна "+sum+" рублей");
        }
    }

    public static void task5() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 5: Вася копит деньги по полугодиям ||");
        System.out.println(separator);
        byte percent = 7;
        short monthsCount =0;
        int sum = 15000;
        while (sum <12_000_000){
            sum = sum+sum*percent/100;
            monthsCount++;
            if (monthsCount%6 == 0) {
                System.out.println("Месяц "+monthsCount+", сумма накоплений равна "+sum+" рублей");
            }
        }
    }

    public static void task6() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 6: Вася копит деньги 9 лет ||");
        System.out.println(separator);
        byte percent = 7;
        short monthsCount =0;
        int sum = 15000;
        while (monthsCount <12*9){
            sum = sum+sum*percent/100;
            monthsCount++;
            if (monthsCount%6 == 0) {
                System.out.println("Месяц "+monthsCount+", сумма накоплений равна "+sum+" рублей");
            }
        }
    }

    public static void task7() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 7: Пятничные отчёты ||");
        System.out.println(separator);
        int firstFriday = 1 + (int) ( Math.random() * 7 );
        for (int day = firstFriday; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 8: Комета Галлея ||");
        System.out.println(separator);
        int period = 79;
        int currentYear = 2023;
        int twoHundredYearsAgo = currentYear-200;
        int oneHundredYearsAfter = currentYear+100;
        for (int year = twoHundredYearsAgo; year <= oneHundredYearsAfter; year=year+period) {
            System.out.println("Год "+year);
        }
    }
}