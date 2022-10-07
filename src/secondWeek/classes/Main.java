package secondWeek.classes;

public class Main {
    public static void main(String[] args) {
        // reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value
        int number1 = 15;
        int number2 = 20;
        number2 = number1;
        number1 =30;
        System.out.println(number2); // 15 yazdırır.

        //
        int [] numbers1 = new int [] {1,2,3};
        int [] numbers2 = new int [] {4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);  // 10 yazdırır.


    }
}

