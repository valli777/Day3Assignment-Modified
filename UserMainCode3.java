import java.util.Scanner;
class UserMainCode3{
String str;
static Boolean validatePlayer(String str)
{
int i=0,count=0;
int len=str.length();
for(i=0;i<len;i++)
{
if((i+1)%2==0)
{
if(str.charAt(i)=='a')
count=count+1;
}
}
if(count==0)
return true;
else
return false;
}
}

class Main{
public static void main(String args[]){
String str1;
Scanner sc=new Scanner(System.in);
UserMainCode3 obj=new UserMainCode3();
str1=sc.nextLine();
boolean a=obj.validatePlayer(str1);
if(a)
System.out.println("Valid");
else
System.out.println("Invalid");
}
}