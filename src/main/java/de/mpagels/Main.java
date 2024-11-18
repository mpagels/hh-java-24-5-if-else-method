package de.mpagels;

public class Main {
    public static void main(String[] args) {

        int age = 19;
        int age2 = 39;
        int age3 = 17;

        boolean result = ageCheck(age);
        System.out.println(result);
        boolean result2 = ageCheck(age2);
        boolean result3 = ageCheck(age3);

        String greetingResult = greetings("Martin");
        System.out.println(greetingResult);
    }

    public static boolean ageCheck(int age) {
        if (age > 18) {
            System.out.println("Ja, die Person ist über 18 Jahre alt.");
            return true;
        } else if (age == 18) {
            System.out.println("Die Person ist genau 18 Jahre alt.");
            return true;
        } else {
            System.out.println("Nein, die Person ist nicht über 18 Jahre alt");
            return false;
        }
    }

    public static String greetings(String name) {
        return "hello " + name;
    }
}