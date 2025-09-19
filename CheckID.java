import java.util.Scanner;

class CheckID
{
public static void main(String[] args){

{Scanner a = new Scanner (System.in);

System.out.println("Please enter your course fee.");

int Fee = a.nextInt();

System.out.println("Please enter your ID type: 1 for alumni, 2 for staff, and 3 for fresher!");

int ID = a.nextInt();

switch (ID)

{case 1: System.out.println("Your final course fee is " + 0.9 * Fee + ".");
break;

case 2: System.out.println("Your final course fee is " + 0.8 * Fee + ".");
break;

case 3: System.out.println("Your final course fee is " + Fee + ".");
break;

default: System.out.println("Please follow given instructions.");

}
}
}
}