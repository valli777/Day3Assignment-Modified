import java.util.Scanner;
class UserMainCode2{
String str;
static Boolean validateCity(String str)
{
int count=0,i=0,count1=0;
int len=str.length();
if(str.charAt(0)!='*' && ((str.charAt(0)>='a' && str.charAt(0)<='z') || (str.charAt(0)>='A' && str.charAt(0)<='Z') ))
count=count+1;
if(str.charAt(1)!='*' && ((str.charAt(1)>='a' && str.charAt(1)<='z') || (str.charAt(1)>='A' && str.charAt(1)<='Z')))
count=count+1;
if(str.charAt(len-2)!='*'&& ((str.charAt(len-2)>='a' && str.charAt(len-2)<='z') || (str.charAt(len-2)>='A' && str.charAt(len-2)<='Z')))
count=count+1;
if(str.charAt(len-1)!='*' && ((str.charAt(len-1)>='a' && str.charAt(len-1)<='z') || (str.charAt(len-1)>='A' && str.charAt(len-1)<='Z')))
count=count+1;
for(i=2;i<len-2;i++)
{
if(str.charAt(i)=='*')
count=count+1;
}
if(count==len)
return true;
else
return false;

}
}
class Main{
public static void main(String args[]){
String str1;
Scanner sc=new Scanner(System.in);
UserMainCode2 obj=new UserMainCode2();
str1=sc.nextLine();
boolean a=obj.validateCity(str1);
if(a)
System.out.println("Valid");
else
System.out.println("Invalid");
}
}