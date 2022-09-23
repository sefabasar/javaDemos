package firstWeek.miniProjeAsalSayi;

public class Main {
    public static void main(String[] args) {

        int number = 25;
        int remainder = 0;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("1 asal değildir.");
            return;
        }
        if (number < 1) {
            System.out.println(" Geçersiz sayı!");
            return;
        }

        for (int i = 2; i < number; i++) {
            remainder = number % i;
            if (remainder == 0)
                isPrime = false;
        }
        if (isPrime)
            System.out.println(number + " asaldır.");
        else
            System.out.println(number + " asal değildir.");

    }
}