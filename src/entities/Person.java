package entities;

public class Person {
    private double height;
    private char gender;

    public Person(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public static double avgHeightWoman(Person[] person) {
        double sumHeight = 0;
        int count = 0;

        for (Person p : person) {
            if (p.getGender() == 'F' || p.getGender() == 'f') {
                sumHeight += p.getHeight();
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return sumHeight / count;
    }

    public static int countMen(Person[] person) {
        int count = 0;

        for (Person p : person) {
            if (p.getGender() == 'M' || p.getGender() == 'm') {
                count++;
            }
        }
        return count;
    }

    public static Person[] lowestPerson(Person[] person) {

        Person lowest = person[0];
        Person highest = person[0];

        for (int i = 1; i < person.length; i++) {
            if (person[i].getHeight() < lowest.getHeight()) {
                lowest = person[i];
            }
            if (person[i].getHeight() > highest.getHeight()) {
                highest = person[i];
            }
        }

        return new Person[] {lowest, highest};
    }
}
