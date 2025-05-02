public class Calculator{
public static int add(int a ,int b)
{
int a=10;
int b=20;
int c=a+b;
 return c;
}
public static int subtract(int a, int b)
{
int a=20;
int b=10;
int c=a-b;
 return c;
}
public static void main (String[] args){
int result=add();
System.out.println("int value:" +result);
int result=subtract();
System.out.println("int answer:" +result);
}
}