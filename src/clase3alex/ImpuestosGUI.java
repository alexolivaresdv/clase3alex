/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3alex;
//import java.util.Scanner;
//Paquete para implementar Ventanas graficas de usuario
import javax.swing.JOptionPane;

/**
 *
 * @author LAB17
 */
public class ImpuestosGUI 
{
   
    public static void main(String[] args)
    {
       int sueldo; 
       
       //Scanner escaner = new Scanner(System.in);
       //System.out.println("Ingrese su salario: ");
       
       //Convertimos el string a enterob antes de guardarlo 
       sueldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese su salario"));
       //sueldo = escaner.nextInt();
       
        if (sueldo>600000) 
        {
            //System.out.println("Debe Pagar Impuesto");
            JOptionPane.showMessageDialog(null, "Debe pagar impuesto");
        }
       
    }
}
