import java.util.Scanner;

class Minimum
{
public static void main(String[] args){

{Scanner a = new Scanner (System.in);
Scanner b = new Scanner (System.in);
Scanner c = new Scanner (System.in);

System.out.println("Please enter three numbers.");

int value1 =a.nextInt();
int value2 =b.nextInt();
int value3 =c.nextInt();


if (value1<value2 && value1<value3)
{System.out.println("Value1 is minimum.");}
else if (value2<value1 && value2<value3)
{System.out.println("Value2 is minimum.");}
else if (value3<value1 && value3<value2)
{System.out.println("Value3 is minimum.");}

}
}
}