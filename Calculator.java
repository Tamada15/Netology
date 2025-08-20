
import java.util.Scanner;

public class Calculator
{
     static int income;
     static int spending;
     static Scanner console = new Scanner(System.in);
    public static void main(String[] args) 
    {
        while (true) 
        { 
            System.out.println("Введите доход");
            String first = console.nextLine();
            income = Integer.parseInt(first);
            System.out.println("Введите расход");
            String two = console.nextLine();
            spending = Integer.parseInt(two);
            Calculate(income, spending);
        }
    }
    public static void Calculate(int income, int spending)
    {
        System.out.println("Итого:");
        System.out.println(Math.abs(income-spending));
    }
}