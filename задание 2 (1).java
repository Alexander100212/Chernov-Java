//задание 1
package test_1;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        if (a > b)
        {
            System.out.println("a > b");
        }
        else if (a < b)
        {
            System.out.println("a < b");
        }
        else
        {
            System.out.println("a = b");
        }

        System.out.println("a+b: " + (a + b));
        System.out.println("a-b: " + (a - b));
        System.out.println("a/b: " + (a / b));
        System.out.println("axb: " + (a * b));
    }
}
