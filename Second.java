import java.util.Scanner;

class Second
{
  public static void main(String[] args){
{Scanner a = new Scanner (System.in);
Scanner b = new Scanner (System.in);
Scanner c = new Scanner (System.in);

System.out.println("Please enter the values of hour, minute, and second.");

int h = a.nextInt();
int m = b.nextInt();
int s = c.nextInt();

System.out.println("01:02:05 in seconds is " + (3600 * h + 60 * m + 1 * s));
}
}
}