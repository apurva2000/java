class ArmstrongNo
{
public static void main(String[] args)
{
int num,rem,sum,no;
System.out.println("Armstrong numbers are:");
for(num=100;num<=999;num++)
{
no=num;
while(num!=0)
{
rem=num%10;
sum=sum+rem*10;
num=num/10;
}
if(sum==no)
{
System.out.println(+sum);
sum=0;
}
}
}
}