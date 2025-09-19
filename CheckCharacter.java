import java.util.Scanner;

class CheckCharacter
{
public static void main(String[] args){

{Scanner a = new Scanner (System.in);

System.out.println("Please enter your preferred character.");

char ch = a.next().charAt(0);

if (Character.isLetter(ch)) {

switch (Character.toLowerCase(ch)){

case 'a':
case 'e':
case 'i':
case 'o':
case 'u':

System.out.println(ch + " is a vowel.");
break;

default: System.out.println(ch + " is a consonant.");
break;
}
}

else {System.out.println("This is neither vowel nor consonant.");}

}
}
}

