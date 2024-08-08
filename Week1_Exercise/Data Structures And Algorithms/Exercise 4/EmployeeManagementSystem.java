public class EmployeeManagementSystem {
    private Employee[] employeeList;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employeeList = new Employee[capacity];
        count = 0;
    }

    // Add an employee to the system
    public void addEmployee(Employee newEmployee) {
        if (count < employeeList.length) {
            employeeList[count] = newEmployee;
            count++;
        } else {
            System.out.println("The employee list is full. Cannot add more employees.");
        }
    }

    // Find an employee by their ID
    public Employee findEmployeeById(int id) {
        for (int i = 0; i < count; i++) {
            if (employeeList[i].getId() == id) {
                return employeeList[i];
            }
        }
        return null;
    }

    // Display all employees
    public void displayEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println("Employee ID: " + employeeList[i].getId());
            System.out.println("Name: " + employeeList[i].getFullName());
            System.out.println("Job Title: " + employeeList[i].getJobTitle());
            System.out.println("Annual Salary: " + employeeList[i].getAnnualSalary());
            System.out.println();
        }
    }

    // Remove an employee by their ID
    public void removeEmployeeById(int id) {
        int indexToRemove = -1;
        for (int i = 0; i < count; i++) {
            if (employeeList[i].getId() == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < count - 1; i++) {
                employeeList[i] = employeeList[i + 1];
            }
            employeeList[count - 1] = null; // Clear the last element
            count--;
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee emp1 = new Employee(1, "John Doe", "Software Engineer", 50000);
        Employee emp2 = new Employee(2, "Jane Doe", "Marketing Manager", 60000);
        Employee emp3 = new Employee(3, "Bob Smith", "Sales Representative", 40000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("Displaying all employees:");
        ems.displayEmployees();

        System.out.println("Searching for employee with ID 2:");
        Employee searchedEmp = ems.findEmployeeById(2);
        if (searchedEmp != null) {
            System.out.println("Employee ID: " + searchedEmp.getId());
            System.out.println("Name: " + searchedEmp.getFullName());
            System.out.println("Job Title: " + searchedEmp.getJobTitle());
            System.out.println("Annual Salary: " + searchedEmp.getAnnualSalary());
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Removing employee with ID 2:");
        ems.removeEmployeeById(2);

        System.out.println("Displaying employees after removal:");
        ems.displayEmployees();
    }
}
