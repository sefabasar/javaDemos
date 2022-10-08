package secondWeek.classes;

public class Main {
    public static void main(String[] args) {
        // reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        // value
        int number1 = 15;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2); // 15 yazdırır.

        //
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);  // 10 yazdırır.

        changeNumber(numbers1);

        System.out.println(numbers1[0]);
        System.out.println(numbers2[0]);

        changeNumber2(numbers1);

        System.out.println(numbers1[0]);
        System.out.println(numbers2[0]);
    }

    //pass by value
    private static void changeNumber2(int[] numbersDiamond) {
        numbersDiamond = new int[]{9, 8, 7};
        System.out.println(numbersDiamond[0]);
    }

    static private void changeNumber(int[] a) {
        a[0] = 30;
        System.out.println(a[0]);
    }
}

