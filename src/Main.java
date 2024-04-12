import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", "Pupkin", 18);
        Person person2 = new Person("Igor", "Igorevich", 70);
        Person person3 = new Person("Petr", "Ivanovich", 55);
        Person person4 = new Person("Max", "Petrovich", 26);
        Person person5 = new Person("Max", "Divich", 18);
        Person person6 = new Person("Vlad", "Petrovich", 15);
        Person person7 = new Person("Inna", "Zarya", 26);
        Person person8 = new Person("Kate", "Niclsone", 31);
        Person person9 = new Person("Ahmed", "Ibrogimov", 29);
        Person person10 = new Person("Vlad", "Igorevich", 37);
        Person person11 = new Person("Tanya", "Vasilieva", 71);
        Person person12 = new Person("Makar", "Petrovich", 26);
        Person person13 = new Person("Aram", "Aliev", 25);
        Person person14 = new Person("Alex", "Smit", 66);
        Person person15 = new Person("Mark", "Avrelian", 66);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);
        personList.add(person11);
        personList.add(person12);
        personList.add(person13);
        personList.add(person14);
        personList.add(person15);

        PersonService.Starting(personList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Нажмите 1 для выбора опций");
        System.out.println("Нажмите 0 для завершения");
        String w = sc.nextLine();
        if (w.equals("1")){
            do {
                PersonService.Starting(personList);
                return;
            }
            while (w.equals("0"));
        }

    }
}
