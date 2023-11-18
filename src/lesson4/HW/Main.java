package lesson4.HW;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
//Добавить метод добавление нового сотрудника в справочник
        directory.add(new Employee("Павел", 123, 89994231538L, 10));
        directory.add(new Employee("Павел", 111, 89996666666L, 11));
        directory.add(new Employee("Павел", 100, 89996843333L, 12));
        directory.add(new Employee("Кирил", 123, 89995653544L, 13));
        directory.add(new Employee("Егор", 153, 89996575756L, 11));
        directory.add(new Employee("Марина", 143, 89991432536L, 15));
        System.out.println();
//Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
        directory.findByName("Павел");
        System.out.println();
        //Добавить метод, который ищет сотрудника по табельному номеру
        directory.findByPersonnelNumber(123);
        System.out.println();
//Добавить метод, который ищет сотрудника по стажу (может быть список)
        directory.findByExperience(11);


    }
}
