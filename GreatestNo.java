import java.util.*;
class GreatestNo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 digits");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int g;
g=a>b?(a>c?a:c):(b>c?b:c);
System.out.println("Greatest Number="+g);
}
}
