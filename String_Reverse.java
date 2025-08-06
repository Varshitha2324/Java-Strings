import java.util.Scanner; 
public class String_Reverse{ 
public static void main(String[] args){ 
Scanner s = new Scanner(System.in); 
System.out.print("Enter a String : "); 
String s1 = s.next(); 
String rev = ""; 
for(int i = 0; i < s1.length(); i++){ 
rev = s1.charAt(i) + rev; 
} 
System.out.println(rev); 
} 
} 