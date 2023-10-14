import java.io.*;
import java.util.Scanner;
class Pangram2{
public static void allLetter(String str){
str=str.toLowerCase();
boolean allLetterPresent=true;
for(char ch='a';ch<='z';ch++){
if(!str.contains(String.valueOf(ch))){
allLetterPresent=false;
break;
}
}
if(allLetterPresent)
System.out.println("It is pangram");
else
System.out.println("It is not pangram");
}
public static void main(String args[]){
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence");
str=sc.nextLine();

allLetter(str);
}}