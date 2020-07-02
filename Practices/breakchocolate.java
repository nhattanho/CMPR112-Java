/* Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line: vertical or horizontal.
Each segment is 1x1.
Input data format: The program gets an input of three integers: N, M, K.
Output data format: The program must output one of the two words: YES or NO.
Example: 
4 2 6 ==> YES 
2 10 7 ==> NO
7 4 21 ==> YES */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int wid = scanner.nextInt();
        int seg = scanner.nextInt();
        if ((seg % len == 0 || seg % wid == 0) && len * wid >= seg) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

