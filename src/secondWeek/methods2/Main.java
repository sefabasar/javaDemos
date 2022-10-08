package secondWeek.methods2;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = sehirVer();
        System.out.println(newMessage);
        int num = topla(5, 7);
        System.out.println(num);
        int total = topla2(1, 2, 5, 7, 8, 10);
    }

    public static void add() {
        System.out.println("Eklendi.");
    }

    public static void delete() {
        System.out.println("Silindi.");
    }

    public static void update() {

        System.out.println("Güncellendi.");
    }

    public static int topla(int num1, int num2) {

        return num1 + num2;
    }

    public static int topla2(int... nums) {
        // int... => variable arguments ( Sanki int array göndermiş gibi. Arka planda sayıları diziye çevirir.)
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static String sehirVer() {
        return "Ankara";
    }


}