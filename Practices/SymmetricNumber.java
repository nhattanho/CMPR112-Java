/* Given a four-digit number. Determine whether its decimal notation is symmetric.
If the number is symmetric, output 1; otherwise output any other integer. The number
may have less than four digits; in this case you should assume that its decimal notation
is complemented by insignificant zeros on the left. 
Example: 
1991 ==> 1
2008 ==> -1*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int temp = input;
        int res = 0;
        while (temp > 0) {
            res = res * 10 + temp % 10; 
            temp = temp / 10;
        }
        if (res == input) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
