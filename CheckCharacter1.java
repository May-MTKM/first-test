import java.util.Scanner;

class CheckCharacter1
{
public static void main(String[] args){

{Scanner a = new Scanner (System.in);

System.out.println("Please enter your preferred character.");

char ch = a.next().charAt(0);

switch (Character.toLowerCase(ch)){

case 'a':
case 'e':
case 'i':
case 'o':
case 'u':

System.out.println(ch + " is a vowel.");
break;

case 'b':
case 'c':
case 'd':
case 'f':
case 'g':
case 'h':
case 'j':
case 'k':
case 'l':
case 'm':
case 'n':
case 'p':
case 'q':
case 'r':
case 's':
case 't':
case 'v':
case 'w':
case 'x':
case 'y':
case 'z':

System.out.println(ch + " is a consonant.");
break;

default: System.out.println("This is neither vowel nor consonant.");
break;
}
}
}
}