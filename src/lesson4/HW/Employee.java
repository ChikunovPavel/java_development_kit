package lesson4.HW;

public class Employee {
    private String name;
    private int personnelNumber;
    private long numberPhone;
    private int experience;

    public Employee(String name, int personnelNumber, long numberPhone, int experience) {
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.numberPhone = numberPhone;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public int getExperience() {
        return experience;
    }


    @Override
    public String toString() {
        return "Табельный номер: " + personnelNumber + ", Имя: " + name +
                ", Номер телефона: " + numberPhone + ", Опыт работы: " + experience;
    }
}







