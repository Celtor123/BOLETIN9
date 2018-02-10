
package boletin96;

import javax.swing.JOptionPane;

public class Traballador {
  double soldo;
  int traballadores1,traballadores2;
    public Traballador() {
    }
    

    public void lerSoldo(){
         
        String a=JOptionPane.showInputDialog("Poña o soldo do traballador \n 0 para cancelar");
        soldo= Double.parseDouble(a);
        while(soldo!=0){
        if (soldo>0){
           if(1000<=soldo&&soldo<=1750){
               traballadores1++;
               String b=JOptionPane.showInputDialog("Poña o soldo do traballador");
               soldo= Double.parseDouble(b);
               
           }
           else if(soldo<1000){
               String b=JOptionPane.showInputDialog("Poña o soldo do traballador");
               soldo= Double.parseDouble(b);
               traballadores2++;
           }
        }
        else{
            JOptionPane.showMessageDialog(null,"Soldo  insuficiente");          
            soldo=0;
            
        } 
        }
        
        
        double porcentaxe1=100*traballadores1/(traballadores1+traballadores2);
        double porcentaxe2=100*traballadores2/(traballadores1+traballadores2);
        JOptionPane.showMessageDialog(null,"A cantidade de traballadores que hai é de "+(traballadores1+traballadores2)+" traballadores"+"\n A cantidade dos que gaña entre 1000 e 1750€ son "+traballadores1+" traballadores "+" que son o "+porcentaxe1+"%"+"\n A cantidade dos que gaña menos de 1000€ son "+traballadores2+" que son o "+porcentaxe2+"%");
        JOptionPane.showMessageDialog(null,"FIN do programa");
        
    }
     
    public static void main(String[] args) {
      Traballador laborioso= new Traballador();
      laborioso.lerSoldo();
    }
    
}

//Codifica un programa que  Lea o soldo de cada un dos traballadores dunha empresa e obteña o número deles que ganan entre 1000 e 1750 €, 
//ámbolos dous incluidos e, a porcentaje de traballadores que ganan menos de 1000 €.
//Tendo en conta que non se coñece con antelación o numero de traballadores da empresa e non se admiten os soldos negativos.
//( utiliza como condidión de fin un soldo 0 ). 