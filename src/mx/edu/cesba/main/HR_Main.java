/*
Nombre: Perez Buenrostro Juan Carlos
Matricula: 1123067
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

public class HR_Main {
    public static void main (String[] args){
        //  Empleados 
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        e1.setid=(1);
        e1.setfirstName (JOptionPane.showInputDialog("Ingrese Nombre"));
        e1.setlastName (JOptionPane.showInputDialog("Ingrese Apellido"));
        e1.setage (Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad")));
        e1.setemail(JOptionPane.showInputDialog("Ingrese Correo Electrónico"));
        e1.setphoneNumber (Integer.parseInt(JOptionPane.showInputDialog("Ingrese Telefono")));
        e1.setsalary (Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario")));
        e1.sethiredate (JOptionPane.showInputDialog("Ingrese Fecha de Contratacion"));
        
   /*     e2.id= 2;
        e2.firstName= JOptionPane.showInputDialog("Ingrese Nombre");
        e2.lastName= JOptionPane.showInputDialog("Ingrese Apellido");
        e2.age= Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        e2.email=JOptionPane.showInputDialog("Ingrese Correo Electrónico");
        e2.phoneNumber=Integer.parseInt(JOptionPane.showInputDialog("Ingresar Telefono"));
        e2.salary=Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario"));
        e2.hiredate=JOptionPane.showInputDialog("Ingrese Fecha de Contratacion");
        
     */   
     
        
        e1.getDetails();
        System.out.print("------------------------------");
       // e2.getDetails();
    }
}
