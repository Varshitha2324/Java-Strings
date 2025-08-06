import java.util.Scanner; 
class palindrome{ 
public static void main(String[] args){ 
Scanner s = new Scanner(System.in); 
System.out.print("Enter the String : "); 
String s1 = s.nextLine(); 
s1 = s1.toLowerCase(); 
boolean isPalindrome = true; 
int i = 0; 
int j = s1.length()-1; 
while(i < j){ 
if(s1.charAt(i)!=s1.charAt(j)){ 
isPalindrome = false; 
break; 
} 
i++; 
j--; 
} 
if(isPalindrome==true){ 
System.out.println("String is a palindrome"); 
}else{ 
System.out.println("String is not a palindrome"); 
} 
} 
}