/*Construir un programa que simule el funcionamiento de una calculadora 
que puede realizar las operaciones aritméticas básicas,
con valores numéricos enteros. El usuario debe especificar la operación
con el primer caracter del parametro de la línea de comandos: 
s o S para suma; r o R para resta; p , P , m o M para la multiplicación;
d o D para la división.*/
package calculadora_operacionesb;

import javax.swing.JOptionPane;

public class Calculadora_OperacionesB {

    public static void main(String[] args) {
        //Declaración de variables
       int n1, n2, suma, resta, mult, div;
       char operacion;
       //Solicitar el ingreso de los datos 
       n1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite un número: "));
       n2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite un segundo número: "));
       operacion = JOptionPane.showInputDialog ("Digite la operación que desea realizar: ").charAt(0);
       //Condiciones
       switch (operacion){
           case 's':
           case 'S': suma = n1+n2;
               JOptionPane.showMessageDialog (null, "La suma es:" +suma);
               break;
           case 'r':
           case 'R': resta = n1-n2;
               JOptionPane.showMessageDialog (null, "La resta es:" +resta);
               break; 
           case 'p':
           case 'P':
           case 'm':    
           case 'M': mult = n1*n2;
               JOptionPane.showMessageDialog (null, "La multiplicación es:" +mult);
               break;
           case 'd':    
           case 'D': mult = n1/n2;
               JOptionPane.showMessageDialog (null, "La división es:" +mult);
               break;
           default: JOptionPane.showMessageDialog (null, "Error, se equivoco de operación");
               break;
    }
      
    }
    
}
