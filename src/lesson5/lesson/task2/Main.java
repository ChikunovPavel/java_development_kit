package lesson5.lesson.task2;

//В рамках выполнения задачи необходимо:
//        Создайте два потока A и B.
//        Поток A меняет значение Boolean переменной switcher с задержкой 1000 миллисекунд (true в состояние false и наоборот).
//        Поток B ожидает состояния true переменной switcher и выводит на консоль обратный отсчет от 100 с задержкой 100 миллисекунд и приостанавливает свое действие, как только поток A переключит switcher в состояние false.
//        Условием завершения работы потоков является достижение отсчета нулевой отметки.
//        Можно воспользоваться синхронизацией для управления значения переменной или volatile

public class Main {


    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2(thread1.isSWITCHER());

        Thread threadA = new Thread(thread1);
        Thread threadB = new Thread(thread2);

        threadA.start();
        threadB.start();
        try {
            threadB.join();
        }catch (InterruptedException E){
            E.printStackTrace();
        }


    }


}
