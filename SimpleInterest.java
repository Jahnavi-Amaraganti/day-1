public class SimpleInterest{
public static void calculateSimpleInterest(double principal, double rate, double time)
{
System.out.println("Simple Interest:" +(principal*rate*time)/100);
}
public static void main(String[]args)
{
calculateSimpleInterest(1000.0,20.0,30.0);
}
}
 