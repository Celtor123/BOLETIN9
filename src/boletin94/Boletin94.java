
package boletin94;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin94 {
    Scanner w = new Scanner(System.in);
    public void tablaMultiplicar(){
    String r=JOptionPane.showInputDialog("Poña un número");
    int e=Integer.parseInt(r);
    int q=1;
    int a=w.nextInt();
    boolean l =(a==0);
       for(a=1;l;a++){
        System.out.println(a*e);   
       
        System.exit(0);
       }
        }
    public static void main(String[] args) {
      Boletin94 a= new Boletin94();
      a.tablaMultiplicar();
    }
    
}

//Codifica un programa que solicite  un número e, visualice a táboa de multiplicar dese número. 
//O programa rematara cando prememos o cero.