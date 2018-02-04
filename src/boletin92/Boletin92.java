
package boletin92;

import javax.swing.JOptionPane;

public class Boletin92 {
    public void operacion(){
      for(int e=10;e<=90;e++){
            for(int r=10;r<=90;r++){
                System.out.println("A suma entre os numeros "+e+" máis "+r+" é "+(e+r));
                System.out.println("O producto entre os numeros "+e+" máis "+r+" é "+(e*r));
            }
            
        }
    }
     
    public static void main(String[] args) {
      Boletin92 qwe= new Boletin92();
      qwe.operacion();
    }    
}

//Realiza un programa que calcule a suma e o producto dos números comprendidos entre 10 e 90 .