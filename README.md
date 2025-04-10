# Hibernate JPA CRUD Demo

A simple Java console application demonstrating CRUD operations using **Hibernate** and **JPA** (without Spring Boot). This project connects to a database and performs Create, Read, Update, and Delete operations on an `Employee` table.


## 📁 Project Structure

src/ └── main/ └── java/ └── hibernate/ └── HibernateDemo/ ├── Employee.java ├── EmployeeDemo.java └── HibernateUtil.java

## 🛠 Technologies Used

- Java 8+
- Hibernate Core 5.6
- JPA 2.2
- MySQL (or compatible DB)
- Maven
- SLF4J + Logback for logging

---

## ⚙️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://patangerohit/Hibernate.git
   cd hibernate-jpa-project

2. Configure Hibernate

<!-- Example hibernate1.cfg.xml -->
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/abc</property>
    <property name="hibernate.connection.username">your_db_username</property>
    <property name="hibernate.connection.password">your_db_password</property>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    <property name="hibernate.hbm2ddl.auto">update</property>
    <property name="show_sql">true</property>
  </session-factory>
</hibernate-configuration>

3. Build the project
mvn clean install

4. Run the application


📌 How It Works
The app prompts you to choose an operation:

Create → Add a new employee

Read → Get employee details by ID

Update → Modify existing employee info

Delete → Remove an employee

Each operation uses a Hibernate session to connect to the database and perform the task.


✅ Example

Which operation you want to perform ?
Create
Enter your name :
John
Enter your salary :
50000
Employee added successfully!

🔎 Notes
Make sure your database is running and credentials are correct.

Hibernate configuration file must be named hibernate1.cfg.xml or updated accordingly in HibernateUtil.java.

🙌 Author
Rohit Patange
Feel free to connect or give a ⭐ on GitHub!



