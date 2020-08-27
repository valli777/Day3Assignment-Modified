import java.util.Scanner;
class UserMainCode{
String str;
static boolean validateDate(String str)
{
int count=0;
int len=str.length();
String s=str.substring(0,2);
String s1=str.substring(3,5);

int a=Integer.parseInt(s);
int b=Integer.parseInt(s1);


if( (a>=1 && a<=31) && (b>=1 && b<=12)){
for(int i=0;i<len;i++)
{
if(str.charAt(i)=='-')
count=count+1;
}
}
if(count==2)
return true;
else
return false;
}}
class Main{
public static void main(String args[]){
String str1;
Scanner sc=new Scanner(System.in);
UserMainCode obj=new UserMainCode();
str1=sc.nextLine();
boolean a=obj.validateDate(str1);
if(a)
System.out.println("Valid");
else
System.out.println("Invalid");
}
}

