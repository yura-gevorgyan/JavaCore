package homeworks.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("NAME: " + employees[i].getName());
            System.out.println("SURNAME: " + employees[i].getSurname());
            System.out.println("EmployeeID: " + employees[i].getEmployeeID());
            System.out.println("SALARY: " + employees[i].getSalary());
            System.out.println("COMPANY: " + employees[i].getCompany());
            System.out.println("POSITION: " + employees[i].getPosition());
            System.out.println("----------------------------");
        }
    }

    public void searchByID(String ID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().toLowerCase().contains(ID.toLowerCase())) {
                System.out.println("NAME: " + employees[i].getName());
                System.out.println("SURNAME: " + employees[i].getSurname());
                System.out.println("EmployeeID: " + employees[i].getEmployeeID());
                System.out.println("SALARY: " + employees[i].getSalary());
                System.out.println("COMPANY: " + employees[i].getCompany());
                System.out.println("POSITION: " + employees[i].getPosition());
                System.out.println("----------------------------");
            }
        }
    }

    public void searchByCompany(String company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().toLowerCase().contains(company.toLowerCase())) {
                System.out.println("NAME: " + employees[i].getName());
                System.out.println("SURNAME: " + employees[i].getSurname());
                System.out.println("EmployeeID: " + employees[i].getEmployeeID());
                System.out.println("SALARY: " + employees[i].getSalary());
                System.out.println("COMPANY: " + employees[i].getCompany());
                System.out.println("POSITION: " + employees[i].getPosition());
                System.out.println("----------------------------");
            }
        }
    }

    private void extend() {
        Employee[] item = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, item, 0, employees.length);
        employees = item;
    }

}
