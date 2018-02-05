
package boletin93;

import javax.swing.JOptionPane;

public class Boletin93 {
    public void rectangulo(){
        String g=JOptionPane.showInputDialog("poña a base do triángulo");
        int e=Integer.parseInt(g);
        String f=JOptionPane.showInputDialog("poña a altura do triángulo");
        int r=Integer.parseInt(f);
        double area=(e*r)/2;
        if(r>=0){
            if(e>=0){
                JOptionPane.showMessageDialog(null, "A área é: "+area);
            }
        }
        
    }
    
    public static void main(String[] args) {
        Boletin93 a= new Boletin93();
        a.rectangulo();
      
    }
    
}

//Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado . 
//Asegurate que estos valores sexan positivos , para eso valida os datos