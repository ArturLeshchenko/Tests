import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {
    public static void Starting(List<Person> personList) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Для выбора фильтрации введите цифру");
            System.out.println("1 для  фильтрации возраста");
            System.out.println("2 для  фильтрации имени");
            System.out.println("3 для  фильтрации фамилии");
            String s = sc.nextLine();
            if (s.equals("1")) {
                System.out.println("Для выбора фильтрации по возрасту введите цифру");
                System.out.println("1 для  фильтрации по возрасту больше введенного числа");
                System.out.println("2 для фильтрации по возрасту меньше введенного числа");
                System.out.println("3 для фильтрации по введенному диапазону");
                String q = sc.nextLine();
                if (q.equals("1")) {
                    List<Person> filteredPersons = PersonService.filtredAge1(personList);
                    for (Person p : filteredPersons) {
                        System.out.println(p);
                    }

                }
                if (q.equals("2")) {
                    List<Person> filteredPersons = PersonService.filtredAge2(personList);
                    for (Person p : filteredPersons) {
                        System.out.println(p);
                    }
                }
                if (q.equals("3")) {
                    List<Person> filteredPersons = PersonService.filtredAge3(personList);
                    for (Person p : filteredPersons) {
                        System.out.println(p);
                    }
                }
            }

            if (s.equals("2")) {
                List <Person> filteredPersons1 = PersonService.filtredName(personList);
                for (Person p : filteredPersons1) {
                    System.out.println(p);
                }

            }
            if (s.equals("3")) {
                List <Person> filteredPersons1 = PersonService.filtredSecondName(personList);
                for (Person p : filteredPersons1) {
                    System.out.println(p);
                }
            }
    }

    public static List<Person> filtredAge1(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для фильтрации введите возраст");
        int age = sc.nextInt();
        List<Person> filtredList1 = new ArrayList<>();
        for (Person p : personList) {
            if (p.getAge() > age) {
                filtredList1.add(p);
            }
        }
        if (filtredList1.isEmpty()) {
            System.out.println("Возраст " + age + " не найден");
            return filtredList1;
        }
        return filtredList1;
    }
    public static List<Person> filtredAge2(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для фильтрации введите возраст или диапозон");
        int age = sc.nextInt();
        List<Person> filtredList1 = new ArrayList<>();
        for (Person p : personList) {
            if (p.getAge() < age) {
                filtredList1.add(p);
            }
        }
        if (filtredList1.isEmpty()) {
            System.out.println("Возраст " + age + " не найден");
            return filtredList1;
        }
        return filtredList1;
    }
    public static List<Person> filtredAge3(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для фильтрации введите диапазон");
        String v = sc.nextLine();
        int znak = v.indexOf('-');
        String z = v.substring(0, znak);
        String y = v.substring(znak + 1);
        int a = Integer.parseInt(z);
        int b = Integer.parseInt(y);
        List<Person> filtredList1 = new ArrayList<>();
        for (Person p : personList) {
            if ((p.getAge() < b)&&(p.getAge() > a)) {
                filtredList1.add(p);
            }
        }
        if (filtredList1.isEmpty()) {
            System.out.println("Возраст из заданого диапазона не найден");
            return filtredList1;
        }
        return filtredList1;
    }
    public static List<Person> filtredName(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для фильтрации введите имя");
        String name = sc.nextLine();
        List<Person> filtredList = new ArrayList<>();
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
        public static List<Person> filtredSecondName(List<Person> personList) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Для фильтрации введите фамилию");
            String secondName = sc.nextLine();
            List<Person> filtredList = new ArrayList<>();
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
