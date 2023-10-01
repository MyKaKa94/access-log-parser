import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scan.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scan.nextInt();
        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Сумма: "+ sum);
        System.out.println("Разность: "+ diff);
        System.out.println("Произведение: "+ multiplication);
        System.out.println("Частное: "+ quotient);
    }
}
