package firstWeek.recapDemo1;

public class Main {
    public static void main(String[] args) {
      // Verilen 3 sayıdan en büyüğünü bulunuz?

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        //  Benim çözümüm:
        /*
        if (sayi1 > sayi2 == sayi1 > sayi3) {
            System.out.println("En büyük sayi: "+ sayi1);
        } else if (sayi2 > sayi1 == sayi2 > sayi3) {
            System.out.println("En büyük sayi: "+ sayi2);
        }else{
            System.out.println("En büyük sayi: "+ sayi3);
        }

         */

        // Video Çözüm:

        int enBuyuk = sayi1 ;

        if (enBuyuk<sayi2){
            enBuyuk= sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: "+ enBuyuk);


    }
}