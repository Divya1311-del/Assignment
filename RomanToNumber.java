import java.util.Scanner;
class RomanToNumber{
public static void main(String args[]) {
RomanToNumber ob= new RomanToNumber();

Scanner sc = new Scanner(System.in);
System.out.println("Enter a RomanNumber:");
String n=sc.nextLine();
System.out.println("number is:"+ob.romanToInt(n));
}
int value(char d){
if(d=='I')
return 1;

if(d=='V')
return 5;
if(d=='X')
return 10;
if(d=='L')
return 50;
if(d=='C')
return 100;
if(d=='D')
return 500;
if(d=='M')
return 1000;
return -1;
}
int romanToInt(String str)
{
int res=0;
for(int i=0;i<str.length();i++)
{
int s1=value(str.charAt(i));
if(i+1<str.length())
{
int s2=value(str.charAt(i+1));
if(s1>=s2){
res=res+s1;
}
else{
res=res-s1;
i++;
}
}
else{
res=res+s1;
}
}
return res;
}
}