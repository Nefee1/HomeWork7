
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

    }

    public static void task1() {
        System.out.println("Задача 1");
        int target = 2_459_000;
        int total = 0;
        int savingsPerMonth = 15_000;
        int month = 0;
        while (total < target) {
            total += savingsPerMonth;
            System.out.println("«Месяц " + month++ + ", сумма накоплений равна " + total + " рублей» ");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a);
        }
        System.out.println("");
        for (; a > 0; a--) {
            System.out.print(a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int countryYPopulation = 12_000_000;
        int fertility = 17;
        int death = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            countryYPopulation += countryYPopulation / 1000 * (fertility - death);
            System.out.println("Год " + year + " , численность населения состовляет " + countryYPopulation);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int target = 12_000_000;
        float total = 15_000;
        int percent = 7;

        for (int month = 0; total < target; month++) {
            total += total * percent / 100;
            System.out.printf("В Месяц %d накопления %.2f \n", month, total);
//            System.out.println("В Месяц " + month + " накопления  " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int target = 12_000_000;
        float total = 15_000;
        int percent = 7;

        for (int month = 0; total < target; month++) {
            total += total * percent / 100;
            if (month % 6 == 0) {
                System.out.printf("В Месяц %d накопления %.2f \n", month, total);
            }

        }
    }

    public static void task6() {
        System.out.println("Задача 5");
        int years = 9;
        int montsInYear = years * 12;
        float total = 15_000;
        int percent = 7;
        for (int month = 1; month < montsInYear; month++) {
            total += total * percent / 100;
            if (month % 6 == 0) {
                System.out.printf("В Месяц %d накопления %.2f \n", month, total);
            }

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int darkFriday = 4;
        int daysInMonth = 31;
        for (; darkFriday <= daysInMonth; darkFriday += 7) {
            System.out.println("Сегодня пятница, " + darkFriday + " -е число. Необходимо " + "подготовить отчет ");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int ASpecificYearOfTheCometsSlight = 79;
        int currenYear = 2023;
        int beforeYears = currenYear - 200;
        int comingYears = currenYear + 100;
        for (int year = 0; year < comingYears; year += ASpecificYearOfTheCometsSlight) {
            if (year > beforeYears) {
                System.out.println(year);
            }
        }
    }
}