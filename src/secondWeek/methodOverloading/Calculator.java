package secondWeek.methodOverloading;

public class Calculator {
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    public int addition(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public int division(int number1, int number2) {
        return number1 / number2;
    }
}
