public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        // String'ler birer karakter dizisidir. Aslına bakarsak bu bir char array'dir.
        System.out.println(mesaj);

        /*

        System.out.println("Eleman sayısı: " + mesaj.length());
        // Bu fonksiyon bize eleman/karakter sayısını verecektir. NOT!!! Boşluklar karakter sayılır.

        System.out.println("5. Eleman: " + mesaj.charAt(4));
        // Bu fonksiyon string ifadenin 5. elemanı gösterir. NOT!!! Diziler 0'dan başlar. 4. indis, 5. elemanı gösterir.

        System.out.println(mesaj.concat(" Yaşasın."));
        // Bu fonksiyon iki string ifadeyi birleştirir. NOT!!! concat yeni bir değişken oluşturur. bunu yazdırmak için yeni bir değişkene atamalısın.

        System.out.println(mesaj.startsWith("B"));
        // Bu fonksiyon string ifadenin hangi karakter ile başladığını sorgulamak için  kullanılır. True/False

        System.out.println(mesaj.endsWith("."));
        // Bu fonksiyon string ifadenin hangi karakter ile bittiğini sorgulamak için  kullanılır. True/False
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler,0 );
        System.out.println(karakterler);
        // Bu fonksiyon srcBegin ile 0'ıncı indisten(0 dahil), srcEnd ile 5. indise kadar(5 dahil değil.) alır.
        // Char tipindeki karakterler dizisine atar. dstBegin ile de karakterler dizisinin kaçıncı indisinden itibaren atayacağına karar verir.

        System.out.println(mesaj.indexOf("a"));
        // Bu fonksiyon belirttiğin karakterin(ister string, ister char yazılabilir.) mesajın içinde kaçıncı karakter olduğunu yazar.

        System.out.println(mesaj.lastIndexOf("ok"));
        // Aramaya sağdan başlar. Baştan kaçıncı index numarası olduğunu yazdırır.
        */

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        // Bu fonksiyon metin içindeki seçilen  char karakter veya string değerleri değiştirmek için kullanılır.

        System.out.println(mesaj.substring(2,5));
        // Bu fonksiyon 2. indexten başlayıp 5. indexe kadar(5 dahil değil) yazdırır. Veya bir indexten başlar, sonuna kadar yazdırır.

        for (String kelime : mesaj.split(" ") ){
            System.out.println(kelime);
        }
        // Bu fonksiyon Belirtilen ifadeye göre metni parçalara ayırır.

        System.out.println(mesaj.toLowerCase());
        // Bu fonksiyon metindeki bütün harfleri küçük yazdırır.

        System.out.println(mesaj.toUpperCase());
        // Bu fonksiyon metindeki bütün harfleri büyük yazdırır.

        System.out.println(mesaj.trim());
        // Metnin başındaki ve saonundaki boşlukları kaldırır.
    }
}