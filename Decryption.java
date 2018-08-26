
//Code By ashishvz//
//all code is copyright to ashdevelopers.,//
import java.util.Scanner;
import java.io.*;

 public class Dec {
    public static void main(String args[]) {
     String str;
     System.out.println("The Decrypted String ");
     Scanner sc = new Scanner(System.in);
     str=sc.nextLine();

      char[] ch = str.toCharArray();               //ORIGINAL String using char (array 1st)

      //looping for encryption.

      for(int i=0;i<ch.length;i++)
      {
          switch(ch[i])
          {
            //blank space
	            case '!' : ch[i]=' ';break;
            //lower case
              case '1' : ch[i]='a';break;
              case 'R' : ch[i]='b';break;
              case 't' : ch[i]='c';break;
              case 'Z' : ch[i]='d';break;
              case '7' : ch[i]='e';break;
              case 'w' : ch[i]='f';break;
              case 'l' : ch[i]='g';break;
              case 'u' : ch[i]='h';break;
              case 'D' : ch[i]='i';break;
              case 'P' : ch[i]='j';break;
              case 'V' : ch[i]='k';break;
              case '4' : ch[i]='l';break;
              case 'Q' : ch[i]='m';break;
              case 'T' : ch[i]='n';break;
              case 'F' : ch[i]='o';break;
              case 'M' : ch[i]='p';break;
              case 'G' : ch[i]='q';break;
              case 'X' : ch[i]='r';break;
              case 'I' : ch[i]='s';break;
              case 'K' : ch[i]='t';break;
              case 'H' : ch[i]='u';break;
              case 'r' : ch[i]='v';break;
              case 's' : ch[i]='w';break;
              case 'U' : ch[i]='x';break;
              case 'v' : ch[i]='y';break;
              case 'm' : ch[i]='z';break;

              //upper case

              case 'n' : ch[i]='A';break;
              case 'e' : ch[i]='B';break;
              case 'i' : ch[i]='C';break;
              case '6' : ch[i]='D';break;
              case 'A' : ch[i]='E';break;
              case '5' : ch[i]='F';break;
              case 'N' : ch[i]='G';break;
              case 'E' : ch[i]='H';break;
              case 'c' : ch[i]='I';break;
              case 'Y' : ch[i]='J';break;
              case '3' : ch[i]='K';break;
              case 'J' : ch[i]='L';break;
              case 'j' : ch[i]='M';break;
              case 'W' : ch[i]='N';break;
              case 'B' : ch[i]='O';break;
              case 'a' : ch[i]='P';break;
              case 'o' : ch[i]='Q';break;
              case 'z' : ch[i]='R';break;
              case '0' : ch[i]='S';break;
              case 'C' : ch[i]='T';break;
              case 'L' : ch[i]='U';break;
              case 'g' : ch[i]='V';break;
              case 'b' : ch[i]='W';break;
              case '9' : ch[i]='X';break;
              case '8' : ch[i]='Y';break;
              case '2' : ch[i]='Z';break;

              //Numeric digits

              case 'x' : ch[i]='0';break;
              case 'q' : ch[i]='1';break;
              case 'k' : ch[i]='2';break;
              case 'S' : ch[i]='3';break;
              case 'y' : ch[i]='4';break;
              case 'f' : ch[i]='5';break;
              case 'd' : ch[i]='6';break;
              case 'h' : ch[i]='7';break;
              case 'O' : ch[i]='8';break;
              case 'p' : ch[i]='9';break;

              default : System.out.println("Not Correct!;(");

          }
      }
	String strnew = new String(ch);
	 System.out.println(strnew);

    }
}
