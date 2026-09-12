import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int randomNumber1 = random.nextInt(10)+1;
        int randomNumber2 = random.nextInt(10)+1;
        int randomNumber3 = random.nextInt(10)+1;

        System.out.println(randomNumber1 + " " + randomNumber2 + " " + randomNumber3);
    }
}
