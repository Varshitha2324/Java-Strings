import java.util.Scanner; 
class vowels_consonants{ 
public static void main(String[] args) { 
Scanner s = new Scanner(System.in); 
System.out.print("Enter the String : "); 
String s1= s.nextLine(); 
s1 = s1.toLowerCase(); 
int length = 0; 
int vowel = 0; 
for(int i = 0; i < s1.length(); i++){ 
if(s1.charAt(i) <= 'z' && s1.charAt(i)>='a'){ 
if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || 
s1.charAt(i) == 'u'){ 
vowel++; 
} 
length++; 
} 
} 
System.out.println(vowel); 
System.out.println(length-vowel); 
} 
}