// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

/**
 * find
 */
public class find {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");int n = sc.nextInt();

        String name1[] = new String[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " name: ");name1[i] = sc.next();
        }

        int stlength = 0;
        System.out.println();
        for (int i=0; i<n; i++){
            
            stlength = stlength + name1[i].length();
        }

        System.out.println("Total length of all enter String: "+ stlength);

    }
}