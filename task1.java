import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введены числа: "+ a + " и " + b);

        int sum = a + b;
        int subtraction = a - b;
        int multiply = a * b;
        double division = (double)a / b;

        System.out.print("Сравнение введенных чисел: ");
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
        System.out.println("Сумма введенных чисел: " + sum);
        System.out.println("Разница введенных чисел: " + subtraction);
        System.out.println("Произведение введенных чисел: " + multiply);
        System.out.println("Деление введенных чисел: " + division);
    }
}