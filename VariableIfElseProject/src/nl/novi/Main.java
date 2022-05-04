package nl.novi;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Voer je naam in: ");
        String userName = input.nextLine();

        if(userName.isEmpty()) {
            System.out.println("Ongeldige naam.");
        }
        else {
            System.out.println("Je naam is: " + userName);
            System.out.println("Je naam bestaat uit " + userName.length() + " karakters.");
            userName = userName.toUpperCase();
            System.out.println("Je naam is: " + userName);
        }

        /*
        int teacherAge = 36;
        String teacherName = "Frits";
       // teacherAge = teacherAge / 2;
        teacherAge = 30;

        System.out.println("De docent heet " + teacherName + " en is " + teacherAge + " jaren oud.");

        boolean teacherAbove30 = teacherAge >= 30;

        if(teacherAbove30) {
            System.out.println("Je bent 30 of ouder dan 30.");
        }
        else {
            System.out.println("Je bent jonger dan 30.");
        }
*/

    }

}
