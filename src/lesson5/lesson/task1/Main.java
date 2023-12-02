package lesson5.lesson.task1;

//В рамках выполнения задачи необходимо:
//        Создать два класс ObjectA, ObjectB
//        Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB

public class Main {
        static Object objectA = new Object();
        static Object objectB = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                workTread1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                workTread2();
            }
        });
        thread1.start();
        thread2.start();

    }

    public static void workTread1() {
        synchronized (objectA) {
            try {
                System.out.println("Поток 1 захватил objectA  ");
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objectB) {
                System.out.println("Поток 1 захватил  objectB ");

            }
        }
    }
    public static void workTread2() {
        synchronized (objectB) {
            try {
                System.out.println("Поток 2 захватил objectB  ");
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objectA) {
                System.out.println("Поток 2 захватил  objectA ");

            }
        }
    }
}







