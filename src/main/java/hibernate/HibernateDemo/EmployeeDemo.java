package hibernate.HibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;

public class EmployeeDemo {
	static  Scanner sc=new Scanner(System.in);
	public static void main( String[] args )
    {
        
        System.out.println("Which operation you want to perform ?");
        String operation=sc.next();
        
        switch(operation) {
        case "Create":create();break;
        case "Read":read();break;
        case "Update":update();break;
        case "Delete":delete();break;
        default : System.out.println("Please provide correct input !");
        }
    }

	private static void delete() {
		try {
		Session session = HibernateUtil.getSession();
	    session.beginTransaction();
	    System.out.println("Enter the Employee ID to delete:");
	    int id = sc.nextInt();
	    Employee emp = session.get(Employee.class, id);
	    if (emp != null) {
	        session.delete(emp);
	        System.out.println("Employee deleted successfully!");
	    } else {
	        System.out.println("Employee not found with ID: " + id);
	    }
	    session.getTransaction().commit();
		}finally {
			HibernateUtil.close();
		}
	}

	private static void update() {
		try {
		Session session = HibernateUtil.getSession();
	    session.beginTransaction();
	    System.out.println("Enter the Employee ID to update:");
	    int id = sc.nextInt();
	    Employee emp = session.get(Employee.class, id);
	    if (emp != null) {
	        System.out.println("Employee found: ");
	        System.out.println("Current Name: " + emp.getName());
	        System.out.println("Current Salary: " + emp.getSalary());

	        System.out.println("Enter new name:");
	        String name = sc.next();
	        System.out.println("Enter new salary:");
	        Double salary = sc.nextDouble();

	        emp.setName(name);
	        emp.setSalary(salary);
	        session.update(emp);
	        System.out.println("Employee updated successfully!");
	    } else {
	        System.out.println("Employee not found with ID: " + id);
	    }
	    session.getTransaction().commit();
		}finally {
			HibernateUtil.close();
		}
	}

	private static void read() {
		try {
		Session session = HibernateUtil.getSession();
	    session.beginTransaction();
	    System.out.println("Enter the Employee ID to read:");
	    int id = sc.nextInt();
	    Employee emp = session.get(Employee.class, id);
	    if (emp != null) {
	        System.out.println("Employee ID: " + emp.getId());
	        System.out.println("Employee Name: " + emp.getName());
	        System.out.println("Employee Salary: " + emp.getSalary());
	    } else {
	        System.out.println("Employee not found with ID: " + id);
	    }
	    session.getTransaction().commit();
		}finally {
			HibernateUtil.close();
		}
	}

	private static void create() {
		try {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter your salary :");
		Double salary=sc.nextDouble();
		Employee emp=new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("Employee added successfully!");
		}finally {
			HibernateUtil.close();
		}
	}
}
