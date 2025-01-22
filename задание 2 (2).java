//задание 2
package test_2;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();

        if (a.equals(b))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }
}