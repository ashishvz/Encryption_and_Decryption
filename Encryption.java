
//Code By ashishvz//
//all code is copyright to ashdevelopers.,//
import java.util.Scanner;
import java.io.*;

 public class Codes {
    public static void main(String args[]) {
     String str;
     System.out.println("Enter the String to Encrypte");
     Scanner sc = new Scanner(System.in);
     str=sc.nextLine();

      char[] ch = str.toCharArray();               //ORIGINAL String using char (array 1ist)
      //looping for encryption.

      for(int i=0;i<ch.length;i++)
      {
          switch(ch[i])
          {
		        //blank space
	           case ' ' : ch[i]='!';break;
            //lower case
              case 'a' : ch[i]='1';break;
              case 'b' : ch[i]='R';break;
              case 'c' : ch[i]='t';break;
              case 'd' : ch[i]='Z';break;
              case 'e' : ch[i]='7';break;
              case 'f' : ch[i]='w';break;
              case 'g' : ch[i]='l';break;
              case 'h' : ch[i]='u';break;
              case 'i' : ch[i]='D';break;
              case 'j' : ch[i]='P';break;
              case 'k' : ch[i]='V';break;
              case 'l' : ch[i]='4';break;
              case 'm' : ch[i]='Q';break;
              case 'n' : ch[i]='T';break;
              case 'o' : ch[i]='F';break;
              case 'p' : ch[i]='M';break;
              case 'q' : ch[i]='G';break;
              case 'r' : ch[i]='X';break;
              case 's' : ch[i]='I';break;
              case 't' : ch[i]='k';break;
              case 'u' : ch[i]='H';break;
              case 'v' : ch[i]='r';break;
              case 'w' : ch[i]='s';break;
              case 'x' : ch[i]='U';break;
              case 'y' : ch[i]='v';break;
              case 'z' : ch[i]='m';break;

              //upper case

              case 'A' : ch[i]='n';break;
              case 'B' : ch[i]='e';break;
              case 'C' : ch[i]='i';break;
              case 'D' : ch[i]='6';break;
              case 'E' : ch[i]='A';break;
              case 'F' : ch[i]='5';break;
              case 'G' : ch[i]='N';break;
              case 'H' : ch[i]='E';break;
              case 'I' : ch[i]='c';break;
              case 'J' : ch[i]='Y';break;
              case 'K' : ch[i]='3';break;
              case 'L' : ch[i]='J';break;
              case 'M' : ch[i]='j';break;
              case 'N' : ch[i]='W';break;
              case 'O' : ch[i]='B';break;
              case 'P' : ch[i]='a';break;
              case 'Q' : ch[i]='o';break;
              case 'R' : ch[i]='Z';break;
              case 'S' : ch[i]='0';break;
              case 'T' : ch[i]='C';break;
              case 'U' : ch[i]='L';break;
              case 'V' : ch[i]='g';break;
              case 'W' : ch[i]='b';break;
              case 'X' : ch[i]='9';break;
              case 'Y' : ch[i]='8';break;
              case 'Z' : ch[i]='2';break;

              //Numeric digits

              case '0' : ch[i]='x';break;
              case '1' : ch[i]='q';break;
              case '2' : ch[i]='k';break;
              case '3' : ch[i]='S';break;
              case '4' : ch[i]='y';break;
              case '5' : ch[i]='f';break;
              case '6' : ch[i]='d';break;
              case '7' : ch[i]='h';break;
              case '8' : ch[i]='O';break;
              case '9' : ch[i]='p';break;

              default : System.out.println("Not Correct!;(");

          }
      }
      String strnew = new String(ch);
      System.out.println(strnew);

    }
}
