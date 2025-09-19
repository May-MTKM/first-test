import java.util.Scanner;

class HourMinuteSecond
{
 public static void main(String[] args){

{Scanner a = new Scanner (System.in);
System.out.println("Please enter the value of second.");

int s = a.nextInt();


System.out.println("This value in hour:minute:second is " + 0 + (s/3600) + ":" + 0 + (s%3600/60) + ":" + 0 + (s%3600%60/1));


}
}
}