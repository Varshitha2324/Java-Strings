//Remove all duplicate characters from a string

import java.util.Scanner;
public class Remove_Duplicates {
    public static String removeDuplicates(String s1) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        String output = removeDuplicates(s1);
        System.out.println("String after removing duplicates: " + output);
    }
}
