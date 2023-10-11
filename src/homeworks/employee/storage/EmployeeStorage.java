package homeworks.employee.storage;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length - 1) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public Employee getById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getID().equals(employeeID)) {
                return employees[i];
            }
        }
        return null;
    }


    public void searchEmployee(Company byId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(byId)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void deleteEmployee(Employee employeeFromStorage) {
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(employeeFromStorage)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
            }
        }
        size--;
    }

    public void deleteEmployeeByCompany(Company companyStorageById) {
        for (int i = 0; i <= size; i++) {
            for (int k = 0; k < size; k++) {
                if (employees[k].getCompany().equals(companyStorageById)) {
                    for (int j = k; j < size - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    size--;
                }
            }
        }
    }
}

