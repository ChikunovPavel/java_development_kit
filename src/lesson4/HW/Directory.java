package lesson4.HW;

import java.util.ArrayList;
import java.util.Collection;

public class Directory {


    private final Collection<Employee> directory;

    public Directory() {
        this.directory = new ArrayList<Employee>();
    }

    public void add(Employee person) {
        directory.add(person);
    }

    public void findByName(String Name) {
        Employee result ;
        for (Employee element : directory) {
            String elementName = element.getName();
            if (elementName.equals(Name)) {
                result = element;
                System.out.println(result.getNumberPhone());

            }
        }
    }

    public void findByPersonnelNumber(int number) {
        Employee result = null;
        for (Employee element : directory) {
            int elementNumber = element.getPersonnelNumber();
            if (elementNumber == number) {
                result = element;
                System.out.println(result);

            }
        }
    }

    public void findByExperience(int number) {
        Employee result = null;
        for (Employee element : directory) {
            int elementNumber = element.getExperience();
            if (elementNumber == number) {
                result = element;
                System.out.println(result);

            }
        }
    }


}






