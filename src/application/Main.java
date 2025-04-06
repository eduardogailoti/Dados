package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas ? ");
        int quantity = sc.nextInt();
        Person[] person = new Person[quantity];

        sc.nextLine();
        for (int i = 0; i < person.length; i++) {
            System.out.printf("--------- %dª pessoa ---------\n", i+1);
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("Gênero [M/F]: ");
            char gender = sc.nextLine().charAt(0);

            person[i] = new Person(height, gender);
        }
        System.out.println();

        Person[] result = Person.lowestPerson(person);
        System.out.printf("Menor altura: %.2f%n", result[0].getHeight());
        System.out.printf("Maior altura: %.2f%n", result[1].getHeight());
        System.out.printf("Média das alturas das mulheres: %.2f%n", Person.avgHeightWoman(person));
        System.out.printf("Número de homens: %d%n", Person.countMen(person));

        sc.close();
    }
}
