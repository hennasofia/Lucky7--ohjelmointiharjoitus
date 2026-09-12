import java.util.Random;
import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int rahamäärä = 0;
        String vastaus = "";

        System.out.println("Syötä rahasumma, jolla haluat pelata. Yksi peli = 1 euro.");
        rahamäärä = Integer.parseInt(in.nextLine()); 

        do {
        int randomNumber1 = random.nextInt(10)+1;
        int randomNumber2 = random.nextInt(10)+1;
        int randomNumber3 = random.nextInt(10)+1;

            System.out.println(randomNumber1 + " " + randomNumber2 + " " + randomNumber3);

        if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7) {
            rahamäärä += 7;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
            System.out.println("Haluatko pelata uudelleen? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
            vastaus = in.nextLine(); 
            if (vastaus.equals("e")) {
                break;
            }
        }
        else if(randomNumber1 == 7 && randomNumber2 == 7) {
            rahamäärä += 5;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
            System.out.println("Haluatko pelata uudelleen? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
            vastaus = in.nextLine(); 
            if (vastaus.equals("e")) {
                break;
            }
        }
        else if(randomNumber1 == 7 && randomNumber3 == 7) {
            rahamäärä += 5;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
            System.out.println("Haluatko pelata uudelleen? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
            vastaus = in.nextLine(); 
            if (vastaus.equals("e")) {
                break;
            }
        }
        else if(randomNumber2 == 7 && randomNumber3 == 7) {
            rahamäärä += 5;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
            System.out.println("Haluatko pelata uudelleen? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
            vastaus = in.nextLine(); 
            if (vastaus.equals("e")) {
                break;
            }
        }

        else if(randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
            rahamäärä += 3;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
            System.out.println("Haluatko pelata uudelleen? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
            vastaus = in.nextLine(); 
            if (vastaus.equals("e")) {
                break;
            }
        }
        else {
            rahamäärä -= 1;
            System.out.println("Hävisit");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
            System.out.println("Haluatko pelata uudelleen? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter");
            vastaus = in.nextLine(); 
            if (vastaus.equals("e")) {
                break;
            }
        }
        }
        while (rahamäärä >= 1);

        System.out.println("Game over");

    }
}