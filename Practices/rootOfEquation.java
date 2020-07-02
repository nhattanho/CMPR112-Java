/* The roots of a cubic equation
Given the numbers a,b,c,d a, b, c, d a,b,c,d. Output in ascending order all the integers between 0 and 1000
which are the roots of the equation ax3+bx2+cx+d=0 ax^3+bx^2+cx+d=0 ax3+bx2+cx+d=0.
If the specified interval does not contain the roots of the equation, do not output anything.
Remember, that cubic equation always has 3 roots. Keep it in mind in order to optimize the code. */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            int temp = a * i * i * i + b * i * i + c * i + d;
            if (temp == 0) {
                count++;
                System.out.println(i);
                if (count == 3) break;
            } 
        }
    }
}
