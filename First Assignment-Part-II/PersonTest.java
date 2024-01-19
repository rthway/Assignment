enum Status {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
}

class MyDate {
    int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

class Person {
    String name, address, phoneNumber, emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

class Employee extends Person {
    String office;
    double salary;
    MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    String officeHours;
    String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123 Main St", "555-1234", "john@example.com", Status.FRESHMAN);
        System.out.println(student);

        Faculty faculty = new Faculty("Dr. Smith", "456 Oak St", "555-5678", "smith@example.com",
                "A123", 80000, new MyDate(2020, 5, 15), "9 AM - 5 PM", "Professor");
        System.out.println(faculty);

        Staff staff = new Staff("Jane Johnson", "789 Pine St", "555-9876", "jane@example.com",
                "B456", 60000, new MyDate(2021, 3, 10), "Administrative Assistant");
        System.out.println(staff);
    }
}
