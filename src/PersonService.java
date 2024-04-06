import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {
    public static List <Person> filtredAge(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для фильтрации введите возраст");
        String age = sc.nextLine();
        int age1 = Integer.parseInt(age);
        List <Person> filtredList = new ArrayList<>();
        for (Person p : personList) {
            if (p.getAge() > age1) {
                filtredList.add(p);
            }
        }
        if (filtredList.isEmpty()) {
            System.out.println("Возраст " + age + " не найден");
            return filtredList;
        }
        return filtredList;
    }
    public static List <Person> filtredName(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для фильтрации введите имя");
        String name = sc.nextLine();
        List <Person> filtredList = new ArrayList<>();
        for (Person p : personList) {
            if (p.getName().equals(name)) {
                filtredList.add(p);
            }
        }
        if (filtredList.isEmpty()) {
            System.out.println("Имя " + name + " не найдено");
            return filtredList;
        }
        return filtredList;
    }
        public static List <Person> filtredSecondName(List<Person> personList) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Для фильтрации введите фамилию");
            String secondName = sc.nextLine();
            List <Person> filtredList = new ArrayList<>();
            for (Person p : personList) {
                if (p.getSecondName().equals(secondName)) {
                    filtredList.add(p);
                }
            }
            if (filtredList.isEmpty()) {
                System.out.println("Фамилия " + secondName + " не найдена");
                return filtredList;
            }
            return filtredList;
    }
}
