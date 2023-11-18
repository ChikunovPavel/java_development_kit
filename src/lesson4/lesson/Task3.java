package lesson4.lesson;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    //    В рамках выполнения задачи необходимо:
//    Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
//    Найдите человека с самым маленьким номером телефона
//    Найдите номер телефона человека чье имя самое большое в алфавитном порядке
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("932432493841", "Иван");
        phonebook.put("92493842", "Иван");
        phonebook.put("9322493843", "Иван");
        phonebook.put("9322493844", "Иван");
        phonebook.put("9", "Иван");
        System.out.println(findByMinPhoneNumber(phonebook));
        findByMaxAlphabetName(phonebook);
    }

//    Найдите человека с самым маленьким номером телефона
    public static String findByMinPhoneNumber(Map<String, String> phonebook) {
        Set<Long> number = phonebook.keySet().stream().map(el -> Long.valueOf(el)).collect(Collectors.toSet());
        long numbers = number.stream().min(Comparator.naturalOrder()).get();
        return String.format("Наименший номер: %s, владелец:  %s",
                numbers, phonebook.get(String.valueOf(numbers)));
    }

    public static String findByMaxAlphabetName(Map<String,String> phonebook){
        Set<Map.Entry<String,String>> elements = phonebook.entrySet();
        Map.Entry<String, String> name = elements.stream().max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).get();
        return String.format("Haибольшее имя в алфавитном порядке: %s, номер телефона %s", name.getValue(), name.getKey() );
    }
}






