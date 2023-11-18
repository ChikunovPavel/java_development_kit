package lesson4.lesson;


//В рамках выполнения задачи необходимо:
//        Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//        Получите уникальный список Set на основании List
//        Определите наименьший элемент (алфавитный порядок)
//        Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//        Удалите все элементы содержащие букву ‘A’


import java.util.*;

public class task2 {
    public static void main(String[] args) {

            List<String> list = generateList();
            Set<String> set = new HashSet<>(list);
            System.out.println(set);
//        System.out.println(getMaxByLength(set));
            removeByChar(set);
            System.out.println(set);
        }


        static void removeByChar(Set<String> set){
            set.removeIf(s -> s.contains("Р°"));
        }

        static String getMaxByLength(Set<String> set){
            return set.stream().max(Comparator.comparingInt(String::length)).get();
        }

        static String getMinByAlphabet(Set<String> set){
            Set<String> set1 = new TreeSet<>(set);
//        System.out.println(set1.stream().max(String::compareTo));
            Iterator<String> iterator = set1.iterator();
            if (iterator.hasNext()){
                return iterator.next();
            }
            return null;
        }

        static List<String> generateList(){
            List<String> list = new ArrayList<>();
            list.add("РљРѕРЅСЃС‚Р°РЅС‚РёРЅ");
            list.add("Р’Р°СЃРёР»РёР№");
            list.add("Р’Р°СЃРёР»РёР№");
            list.add("РЎРІРµС‚Р»Р°РЅР°");
            list.add("РЎРІРµС‚Р»Р°РЅР°");
            list.add("РЎРІРµС‚Р»Р°РЅР°");
            list.add("РђРЅРЅР°");
            list.add("РђРЅРЅР°");
            list.add("РРІР°РЅ");
            list.add("РЎРµРјРµРЅ");
            return list;
        }















}
