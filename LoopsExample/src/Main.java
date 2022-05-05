import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput = -1;

        Scanner input = new Scanner(System.in);
        int counter = 0;

        String courseName = "Basis Programmeren";
        if(courseName.equals("Basis Programmeren")) { // equals() beter dan ==
            System.out.println("Cursusnaam is correct.");
        }

        // Voorbeeld van een for-loop
        for(int i=0; i < courseName.length(); i++) {
            if(i % 2 == 0) {
                System.out.println(courseName.charAt(i));
            }
        }

        // Voorbeeld van een for-loop
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

/*
// Zie ook https://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner voor extra toelichting
        // Voorbeeld van een while-loop
        while(userInput < 0 || userInput > 10) {
            System.out.println("Voer een getal in: ");
            userInput = input.nextInt();
            if (userInput > 0 && userInput <= 10) {
                System.out.println("Het getal is: " + userInput);
                //break;
            } else {
                System.out.println("Ongeldig getal");
            }
            counter++;
            if(counter > 4) {
                System.out.println("Maximaal aantal pogingen bereikt. Ik stop er mee");
                System.exit(0);
            }
        }
*/

    }
}