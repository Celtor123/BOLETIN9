
package boletin95;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin95 {
    Scanner imprime=new Scanner(System.in);

    public void menu(){
        String a=JOptionPane.showInputDialog("Escriba cuantos números debe tener la serie");
        int r= Integer.parseInt(a);
      System.out.println("Menú de operaciones");
      System.out.println("1. serie a");
      System.out.println("2. serie b");
      System.out.println("3. serie c");
       int respuesta=imprime.nextInt();
       int d;
      switch(respuesta){
         
          case 1:
             
         for(d=2;d<=(r*2);d=d+2){ 
             System.out.println(d);
         }
          break;
          case 2:
              int p=1;
              int z=-1;
          do{
              
             if (z<0){
                 System.out.println(z);
               z=z-1; 
               z=-z;
             }
             else{
              System.out.println(z);
              z=z+1; 
               z=-z;
          }
              p++;
          }while(p<=r);
          
          break;
          case 3:
              int num1 = 1;
              int num2 = 0;
              int y=1;
              System.out.println(0);
         do{              
             int numx=num1;
             num1=num2;
             num2=numx+num2;
             System.out.println(num2);
               y++;
          }while(y<r);
          break;                
          default:
          System.out.println("serie incorrecta");
          break;
          
      }
    }
     
    public static void main(String[] args) {
       Boletin95 a=new  Boletin95();
       a.menu();
    }
    
}

//Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
//a)  2 + 4 + 6 + 8 + 10 …..
//b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
//c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………