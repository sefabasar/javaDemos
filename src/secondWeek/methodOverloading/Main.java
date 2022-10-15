package secondWeek.methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        System.out.println(calculator.addition(2,3));
        calculator.addition(1,2,3);
    }
}
