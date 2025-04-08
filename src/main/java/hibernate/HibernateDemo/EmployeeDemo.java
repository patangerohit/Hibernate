package hibernate.HibernateDemo;

import org.hibernate.Session;

public class EmployeeDemo {
	public static void main( String[] args )
    {
Session session = HibernateUtil.getSession();
        

        try {
            // Start a transaction
            session.beginTransaction();

            // Create a new Employee object
          //Employee employee = session.find(Employee.class,5);
            
            Employee employee1 =new Employee();
      
           employee1.setName("Shraddha");
           employee1.setSalary(10000000);
//
//            // Save the employee object
            session.save(employee1);
            //session.delete(employee);
            //session.update(employee);
            // Commit the transaction
            session.getTransaction().commit();

            System.out.println("Employee saved with ID: " + employee1.getId());
        } finally {
            HibernateUtil.close();
        }
    }
}
