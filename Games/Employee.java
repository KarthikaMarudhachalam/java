
//Method overriding
class Salarydetails 
{
  int salary()
  {
    return 0;
  }
}
class Developer extends Salarydetails
{
  int salary()
  {
    return 80000;
  }
}   
class Tester extends Salarydetails
{
  int salary()
  {
    return 55000;
  }
}    
class DataAnalytics extends Salarydetails
{
  int salary()
  {
    return 65000;
  }
}
class Dbadmin extends Salarydetails
{
  int salary()
  {
  return 40000;
  }
  
}
public class Employee
{
  public static void main(String[] args) 
  {
    Developer obj1=new Developer();
    Tester obj2=new Tester();
    DataAnalytics obj3=new DataAnalytics();
    Dbadmin obj4=new Dbadmin();

    System.out.println("The salary of a developer is:"+obj1.salary());
    System.out.println("The salary of a Tester is:"+obj2.salary());
    System.out.println("The salary of a DataAnalytics is:"+obj3.salary());
    System.out.println("The salary of a Database administer is:"+obj4.salary());
  }
}
