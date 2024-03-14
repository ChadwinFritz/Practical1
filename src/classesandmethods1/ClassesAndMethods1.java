package classesandmethods1;

import java.util.*;

public class ClassesAndMethods1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        

        Employee man1; // = new Employee();

        System.out.println("Employee 1");
        System.out.println("----------");

        System.out.print("What is your name = ");
        String name1 = sc.nextLine();

        System.out.print("What is your surname = ");
        String surname1 = sc.nextLine();

        System.out.print("What is your Employee Number = ");
        String empNumber1 = sc.nextLine();

        System.out.print("What is your Salary = ");
        double salary1 = sc.nextDouble();

        man1 = new Employee(name1, surname1, empNumber1, salary1);

        System.out.println("");

        Employee man2; // = new Employee();

        System.out.println("Employee 2");
        System.out.println("----------");

        System.out.print("What is your name = ");
        String name2 = sc.nextLine();
        name2 = sc.nextLine();

        System.out.print("What is your surname = ");
        String surname2 = sc.nextLine();

        System.out.print("What is your Employee Number = ");
        String empNumber2 = sc.nextLine();

        System.out.print("What is your Salary = ");
        double salary2 = sc.nextDouble();

        System.out.println("");

        man2 = new Employee(name2, surname2, empNumber2, salary2);

        System.out.println("Employee Details");
        System.out.println("----------------");

        System.out.println(man1);
        System.out.println(man2);

        System.out.println("");

        System.out.print("Enter a percentage to increase employee 1 salary = ");
        double inc1 = sc.nextDouble();

        System.out.print("");

        System.out.print("Enter a percentage to increase employee 2 salary = ");
        double inc2 = sc.nextDouble();

        System.out.println("");

        man1.increaseSalary(inc1);
        man2.increaseSalary(inc2);

        System.out.println(man1);
        System.out.println(man2);

    }

}
