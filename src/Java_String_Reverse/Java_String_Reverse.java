package Java_String_Reverse;

import java.io.*;
import java.util.*;


public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = new StringBuilder(A).reverse().toString();
        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
