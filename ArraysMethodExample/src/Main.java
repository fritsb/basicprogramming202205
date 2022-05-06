import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Hoeveel artiesten wil je invoeren?");
        //int numArtists = input.nextInt();
        //input.nextLine();

        //String[] artists = new String[numArtists];
        String[] artists = new String[2];

        System.out.println("Voer artiesten in:");

       // for(int i = 0; i < artists.length; i++) {
        for(int i = 0; i < 3; i++) {
            artists[i] = input.nextLine();
        }

        displayArtists(artists);
    }
    public static void displayArtists(String[] artists) {
        System.out.println("De volgende artiesten staan in de verzameling:");
        for(int i = 0; i < artists.length; i++) {
            System.out.println("Artiest " + i + ": " + artists[i]);
        }
    }
}