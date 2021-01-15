package SequentialPrograms;

import java.util.Scanner;

/*
PROGRAM-12

In number theory, a vampire number (or true vampire number) is a composite natural number with an even
number of digits, that can be factored into two natural numbers each with half as many digits as the
original number and not both with trailing zeroes, where the two factors contain precisely all the
digits of the original number, in any order, counting multiplicity. The first vampire number is 1260 = 21 × 60.
A vampire number can have multiple distinct pairs of fangs. The first of infinitely many vampire numbers
 with 2 pairs of fangs:

Rules:
    1. Split into 2 distinct numbers with half as many digits as the original
    2. each pair must not have trailing zeros
    3. each pair stringcombined must contain all the exact digits in the original

125460 = 204 × 615 = 246 × 510
The first with 3 pairs of fangs:

13078260 = 1620 × 8073 = 1863 × 7020 = 2070 × 6318
The first with 4 pairs of fangs:

16758243290880 = 1982736 × 8452080 = 2123856 × 7890480 = 2751840 × 6089832 = 2817360 × 5948208
The first with 5 pairs of fangs:

24959017348650 = 2947050 × 8469153 = 2949705 × 8461530 = 4125870 × 6049395 = 4129587 × 6043950 = 4230765 × 5899410
*/

public class VampireNumber {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int len = s.length();
        int f = 0;
        if (len == 4)
        {
            int num1 = n / 100;
            int num2 = n % 100;
            int a[] = new int[4];
            int arr[] = new int[2];

            a[0] = num1 / 10;
            a[1] = num1 % 10;
            a[2] = num2 / 10;
            a[3] = num2 % 10;

            for (int i = 0; i < a.length; i++){
                int result = 0;

                if (f == 1) break;
                for (int j = 0; j < a.length; j++) {
                    if (f == 1) break;
                    if (j == i) continue;

                    for (int k = 0; k < a.length; k++) {
                        if (f == 1) break;
                        if ((k == i) || (k == j)) continue;

                        for (int l = 0; l < a.length; l++) {
                            if ((l == i) || (l == j) || (l == k)) continue;

                            arr[0] = a[i] * 10 + a[j];
                            arr[1] = a[k] * 10 + a[l];
                            result = arr[0] * arr[1];

                            if (result == n) {
                                f = 1;
                                break;
                            }
                        }
                    }
                }
            }

            if (f == 1) {
                System.out.println("IT’S A VAMPIRE NUMBER");
                System.out.println(n + " = " + arr[0] + " * " + arr[1]);
            } else
                System.out.println("NOT A VAMPIRE NUMBER ");

        }
        else
            System.out.println("OUT OF RANGE");

        sc.close();

    }
}