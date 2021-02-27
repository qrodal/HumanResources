/*
Nombre: Perez Buenrostro Juan Carlos
Matricula:1123067
 */
package mx.edu.cesba.model;


    public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private double salary;
    private String hiredate;
    public int setid;
   
    public void setId(int id){
        this.id=id;
        
    }
    public int getId(){
        return id;
    }
     public void setfirstName(String firstName){
        this.firstName=firstName;
        
    }
    public String getfirstName(){
        return firstName;
    }
    public void setlastName(String lastName){
        this.lastName=lastName;
        
    }
    public String getlastName(){
        return lastName;
    }
        
    public void setage(int age){
        if(age>=18 && age<65){
          this.age=age;  
        }else {
            System.err.println("Favor de validar la edad");
        }
        
        
    }
    public int getage(){
        return age;
    }
    public void setemail(String email){
        this.email=email;
        
    }
    public String getemail(){
        return email;
    }
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
        
    }
    public int getphoneNumber(){
        return phoneNumber;
    }
    public void setsalary(double salary){
        this.salary=salary;
        
    }
    public double getsalary(){
        return salary;
    }
    public void sethiredate(String hiredate){
        this.hiredate=hiredate;
        
    }
    public String gethiredate(){
        return hiredate;
    }
    
   public void getDetails() { //METODO
        System.out.println("id:" + id);
        System.out.println("FirstName:" + firstName);
        System.out.println("LastName:" + lastName);
        System.out.println("Age:" + age);
        System.out.println("Email:" + email);
        System.out.println("PhoneNumber:" + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Hiredate:" + hiredate);
       
       
}

    
}
