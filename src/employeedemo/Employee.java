package employeedemo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy F McKay
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public Employee()
    {
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }
    
    public Employee(String empName, int id, String dept, String pos)
    {
        name = empName;
        idNumber = id;
        department = dept;
        position = pos;
    }
    
    
    public Employee(String empName, int id)
    {
        name = empName;
        idNumber = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public int getIdNumber()
    {
        return idNumber;
    }
    
    public void setName(String empName)
    {
        name = empName;
    }
    
    public void setIdNumber(int id)
    {
        idNumber = id;
    }
    
    public void setDepartment(String dept)
    {
        department = dept;
    }
    
    public void setPosition(String pos)
    {
        position = pos;
    }
    
    public void writeOutput()
    {
        System.out.println("Name = " + name);
        System.out.println("ID Number = " + idNumber);
        System.out.println("Department = " + department);
        System.out.println("Position = " + position);
        System.out.println();
    }
}
