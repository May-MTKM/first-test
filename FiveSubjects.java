import java.util.Scanner;

class FiveSubjects
{
public static void main(String[] args){
{Scanner a = new Scanner (System.in);
Scanner b = new Scanner (System.in);
Scanner c = new Scanner (System.in);
Scanner d = new Scanner (System.in);
Scanner e = new Scanner (System.in);
System.out.println("Please enter your score of five subjects.");

int Myan = a.nextInt(), Eng = b.nextInt(), Phys = c.nextInt(), Chem = d.nextInt(), Bio = e.nextInt();

if (Myan < 40|| Eng < 40|| Phys < 40 || Chem < 40|| Bio < 40)
{System.out.println("You fail.");}

else if (Myan >=80|| Eng >=80|| Phys >=80 || Chem >=80|| Bio >=80)
{System.out.println("You got a distinction.");}

else if (Myan >=65 && Eng >=65 && Phys >=65 && Chem >=65 && Bio >=65)
{System.out.println("You got a credit.");}

else if (Myan >=40 && Eng >=40 && Phys >=40 && Chem >=40 && Bio >=40)
{System.out.println("You pass.");}

}
}
}