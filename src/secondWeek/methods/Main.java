package secondWeek.methods;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca() {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean sonuc = false;

        for (int num : sayilar) {
            if (num == aranacak) {
                sonuc = true;
                break;
            }
        }
        if (sonuc)
            sendMessage("Sayı mevcuttur. Sayı: " + aranacak);
        else
            sendMessage("Sayı mevcut değildir. Sayı: " + aranacak);


    }

    // parametreli method.
    public static void sendMessage(String message) {
        System.out.println(message);

    }
}
