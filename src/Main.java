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

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 23;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int degrees = -7;
        if (degrees >= 5) {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки.");
        } else  {
            System.out.println ("На улице " + degrees + " градусов, нужно надеть шапку.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 19;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить  в садик");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить в универ");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
       int age = 12;
        if (age < 5) {
              System.out.println("Если возраст ребенка равен " + age + "то он не может кататься на аттракционе");
       }
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + "то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            }
            if (age > 14) {
                System.out.println("Если возраст ребенка равен " + age + "то он может кататься без сопровождения взрослого");
            }
    }



    public static void task6 () {
        System.out.println("Задача 6");
        int trainPass = 102;
        int trainPassSeat = 60;
        int trainPassStand = trainPass-trainPassSeat;
        int passNumber = 104;
         if (passNumber <= 60) {
             System.out.println("Если место номер " + passNumber + " то, место сидячее" );
        }
         else if (passNumber > 60 && passNumber <= 102) {
            System.out.println("Если место номер" + passNumber + "то, место стоячее.");
        }
         else {
             System.out.println("Вагон полностью забит.");
         }
    }


    public static void task7 () {
        System.out.println("Задача 7");
    }
        public static void task8 () {
            System.out.println("Задача 8");
        }

}