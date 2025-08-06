import java.util.Scanner;
class Anagrams{
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = str2.indexOf(ch);
            if (index == -1) {
                return false;
            }
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String first = sc.nextLine();
        System.out.println("Enter second string:");
        String second = sc.nextLine();
        if (isAnagram(first, second)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        }
}
