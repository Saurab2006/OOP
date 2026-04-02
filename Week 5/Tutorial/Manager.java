package Tutorial;
interface Employee {
    void printEmployeeId();
    void printSalary();
}

class Manager implements Employee {
    int empId;
    double salary;

    Manager(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public void printEmployeeId() {
        System.out.println("Manager ID: " + empId);
    }

    @Override
    public void printSalary() {
        System.out.println("Manager Salary: " + salary);
    }
}
class Developer implements Employee {
    int empId;
    double salary;

    Developer(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public void printEmployeeId() {
        System.out.println("Developer ID: " + empId);
    }

    @Override
    public void printSalary() {
        System.out.println("Developer Salary: " + salary);
    }
}

