
package boletin91;

import javax.swing.JOptionPane;


public class Boletin91 {
    public void operacion(){
        int e = 0,f = 0,j = 0;
        for(int num=1;num<=10;num++){
            String g=JOptionPane.showInputDialog("poña un número");
            int r=Integer.parseInt(g);
           
           if(r==0){
                e++;
            }
           else if(r<0){
               f++;
            }
           else if(r>0){
                j++;
           }
                   
        }  
        System.out.println("Hay "+e+" ceros");
        System.out.println("Hay "+f+" números negativos");
        System.out.println("Hay "+j+" números positivos");
    }

    public static void main(String[] args) {
        Boletin91 are= new Boletin91();
      are.operacion();
    }
}

//Calcula a cantidade de números negativos, positivos e, ceros  que hai nun grupo de 10 numeros . 