import java.util.Random;

public class giveRandomLottoNumbers {

    public static void main(String[] args) {

        int count = 1;
        do {
            Random dice = new Random();
            int number;

            number = 1 + dice.nextInt(49);
            System.out.print(number + " ");
            count++;
        } while (count <= 6);

    }
}
