
public class Main {
    public static void main(String[] args) {

        System.out.println("5я домашка");
        task1();
        task2();
          task3();
          task4();
           task5();


    }

    public static void task1() {

        int clientOS = 1;

        System.out.println("              ");
        System.out.println("Task1 printout");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("");
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2() {

        int clientOS = 0;
        int clientDeviceYear = 2013;
        System.out.println("              ");
        System.out.println("Task2 printout");

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientOS == 1) System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clientDeviceYear >= 2015) {
    //        System.out.println("Зашли во вторую ветку");
            if (clientOS == 0) System.out.println("Установите версию приложения для IOS по ссылке");
            if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");

     //         System.out.println("Зашли во вторую ветку второй ветки");
     //       System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        int year = 2020;
        boolean leapYear = false;
 //       boolean leap400 = false;

        System.out.println("              ");
        System.out.println("Task3 printout");


        if (year % 4 == 0 ) leapYear = true;
        if (year % 400 ==0) leapYear = true;

        if (year % 100 == 0) leapYear = false;


        if (leapYear) {
            System.out.println( year + "  Год високосный");
        } else {
            System.out.println(year + "  Год невисокосный");
        }
    }

    public static void task4() {
        int deliveryDistance = 100;
        int deliveryTime =0;
        boolean delivery = false;


        System.out.println("              ");
        System.out.println("Task4 printout");


        if (deliveryDistance >=20 ) {
            deliveryTime=1;
            delivery=true;}

        if (deliveryDistance >20 && deliveryDistance <= 60 ) {
            deliveryTime=2;
            delivery=true;}

        if (deliveryDistance >60 && deliveryDistance <= 100 ) {
            deliveryTime=3;
            delivery=true;}


        if (deliveryDistance >100 ) {delivery=false;
            System.out.println("Доставка невозожна");
        }

        if (delivery) System.out.println("доставка займет: " + deliveryTime + " дней ");




    }
    public static void task5() {

        int monthNumber = 3;


        System.out.println("              ");
        System.out.println("Task5 printout");

        switch (monthNumber) {
            case 1:
                System.out.println("Январь это зима");
                break;
            case 2:
                System.out.println("Февраль это зима");
                break;
            case 3:
                System.out.println("Март это весна");
                break;
            case 4:
                System.out.println("Апрель это весна");
                break;
            case 5:
                System.out.println(" Май это весна");
                break;
            case 6:
                System.out.println("Июнь это лето");
                break;
            case 7:
                System.out.println("Июль это лето");
                break;
            case 8:
                System.out.println(" Август это лето");
                break;
            case 9:
                System.out.println("Сентябрь это осень");
                break;
            case 10:
                System.out.println(" Октябрь это осень");
                break;
            case 11:
                System.out.println("Ноябрь это осень");
                break;
            case 12:
                System.out.println(" Декабрь это зима");
                break;
            default:
                System.out.println("Месяца с таким номером нет");
                break;
        }

        System.out.println("Завершение 5-го ДЗ");

    }
}


