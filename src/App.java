import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int rahamäärä = 5;

        do {
        int randomNumber1 = random.nextInt(10)+1;
        int randomNumber2 = random.nextInt(10)+1;
        int randomNumber3 = random.nextInt(10)+1;

            System.out.println(randomNumber1 + " " + randomNumber2 + " " + randomNumber3);

        if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7) {
            rahamäärä += 7;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
        }
        else if(randomNumber1 == 7 && randomNumber2 == 7) {
            rahamäärä += 5;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
        }
        else if(randomNumber1 == 7 && randomNumber3 == 7) {
            rahamäärä += 5;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
        }
        else if(randomNumber2 == 7 && randomNumber3 == 7) {
            rahamäärä += 5;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
        }

        else if(randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
            rahamäärä += 3;
            System.out.println("Voitit!");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
        }
        else {
            rahamäärä -= 1;
            System.out.println("Hävisit");
            System.out.println("Sinulla on rahaa " + (rahamäärä) + " euroa");
        }
        }
        while (rahamäärä >= 1);

        System.out.println("Game over");

    }
}