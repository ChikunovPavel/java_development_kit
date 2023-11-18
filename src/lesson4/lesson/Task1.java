package lesson4.lesson;
//В рамках выполнения задачи необходимо:
//        Создайте коллекцию мужских и женских имен с помощью интерфейса List
//        Отсортируйте коллекцию в алфавитном порядке
//        Отсортируйте коллекцию по количеству букв в слове
//        Разверните коллекцию

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List <String> name =new ArrayList<>();
        name.add("Лена");
        name.add("Дима");
        name.add("Алина");
        name.add("Сергей");
        name.add("Мария");
        name.add("Боря");
        name.add("Юля");
        name.add("Александр");

        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);
        name.sort(Comparator.comparing(String::length));
        System.out.println(name);
        Collections.reverse(name);
        System.out.println(name);






    }


}
