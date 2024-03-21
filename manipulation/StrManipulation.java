import java.util.*;
class StrManipulation{
public static void main(String[] args){
char chs[]={'W','E','L','C','O','M','E'};
String newStr=new String(chs);
System.out.println("\n New String from chr[] using new string:" +newStr);
//String length
System.out.println("\n ----STRING LENGTH----");
String s1="hello";
String s2="World";
System.out.println("String length of " +s1+ " : " +s1.length());
//Uppercase and lowercase
System.out.println("\n ----UPPERCASE & LOWERCASE----");	
System.out.println(s1+" to Upper Case:"+s1.toUpperCase());
System.out.println(s1+" to Lower Case:"+s1.toLowerCase());
//string concatination
System.out.println("\n ----CONCATENATION----");
System.out.println("Using concat():"+s1.concat(s2));
System.out.println("Using + operator:"+s1+s2);
//string position
System.out.println("\n ---STRING POSITION----");
System.out.println("Character at 3rd position:"+s1.charAt(3));
char c[]=new char[5];
s1.getChars(2,4,c,0);
System.out.println("Character between 2 and 4:"+new String(c));
//Case compare
System.out.println("\n ----CASE COMPARE----");
s1="hello";
s2="HELLO";
System.out.println(s1+" Equals "+s2+":"+s1.equals(s2));
System.out.println(s1+" Equals ignore case "+s2+":"+s1.equalsIgnoreCase(s2));
System.out.println(s1+" Start with H : "+s1.startsWith("H"));
System.out.println(s1+" End with z : "+s1.startsWith("H"));
//Search Substring
System.out.println("\n ----SEARCH SUBSTRING----");
s1="have a nice day";
System.out.println("Index of nice in : "+s1+" is "+s1.indexOf("nice"));
//Modify String
System.out.println("\n ----MODIFY STRING----");
System.out.println("Substring of "+s1+" : "+s1.substring(12));
System.out.println("String replacing : "+s1.replace("nice","good"));
//Using valuesof()
System.out.println("\n ----USING valuesOf()----");
float n=15.3f;
System.out.println(n+" is converted to : " +String.valueOf(n));
}
}
