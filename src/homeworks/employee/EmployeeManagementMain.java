package homeworks.employee;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;
import homeworks.employee.storage.CompanyStorage;
import homeworks.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeManagementMain {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addCompany();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    employeeStorage.print();
                    break;
                case "5":
                    searchEmployeeById();
                    break;
                case "6":
                    searchEmployeeByCompany();
                    break;
                case "7":
                    changeCompany();
                    break;
                case "8":
                    changeEmployee();
                    break;
                case "9":
                    deleteEmployee();
                    break;
                case "10":
                    deleteCompany();
                    break;
            }
        }
    }

    private static void deleteCompany() {
        companyStorage.print();
        System.out.println("Please choose COMPANY Id FOR DELETE");
        String companyId = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyId);

        if (companyStorageById == null){
            System.out.println("Company with " + companyId + " Id does not existed");
            return;
        }

        employeeStorage.deleteEmployeeByCompany(companyStorageById);
        companyStorage.deleteCompany(companyStorageById);

        System.out.println("Company and Employees are deleted");

    }

    private static void deleteEmployee() {
        companyStorage.print();
        System.out.println("Please input COMPANY Id");
        String companyId = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyId);

        if (companyStorageById == null) {
            System.out.println("Company with " + companyId + " Id does not existed");
            return;
        }

        employeeStorage.searchEmployee(companyStorageById);

        System.out.println("Please input EMPLOYEE Id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);

        if (employeeFromStorage == null) {
            System.out.println("Employee with " + employeeId + " Id does not existed !!!");
            return;
        }

        if (!employeeFromStorage.getCompany().equals(companyStorageById)){
            System.out.println("Please input FULL Id");
            return;
        }

        employeeStorage.deleteEmployee(employeeFromStorage);

        System.out.println("Employee is deleted");
    }

    private static void changeEmployee() {
        companyStorage.print();
        System.out.println("Please input COMPANY Id");
        String companyId = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyId);

        if (companyStorageById == null) {
            System.out.println("Company with " + companyId + " Id does not existed");
            return;
        }

        employeeStorage.searchEmployee(companyStorageById);

        System.out.println("Please input EMPLOYEE Id");
        String employeeId = scanner.nextLine();
        Employee employeeStorageById = employeeStorage.getById(employeeId);
        if (employeeStorageById == null) {
            System.out.println("Employee with " + employeeId + " Id does not existed !!!");
            return;
        }

        if (!employeeStorageById.getCompany().equals(companyStorageById)){
            System.out.println("Wrong !!!!");
            return;
        }

        System.out.println("Please input NEW NAME");
        String employeeName = scanner.nextLine();
        System.out.println("Please input NEW SURNAME");
        String employeeSurname = scanner.nextLine();
        System.out.println("Please input NEW PHONE");
        String employeePhone = scanner.nextLine();
        System.out.println("Please input NEW POSITION");
        String employeePosition = scanner.nextLine();
        System.out.println("Please input NEW SALARY");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        employeeStorageById.setName(employeeName);
        employeeStorageById.setSurname(employeeSurname);
        employeeStorageById.setPhone(employeePhone);
        employeeStorageById.setPosition(employeePosition);
        employeeStorageById.setSalary(employeeSalary);
        System.out.println("Employee data is changed !!!");

    }

    private static void changeCompany() {
        companyStorage.print();
        System.out.println("Please choose COMPANY Id");
        String companyId = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyId);

        if (companyStorageById == null) {
            System.out.println("Company with " + companyId + " Id does not existed");
            return;
        }

        System.out.println("Please input NEW NAME");
        String companyName = scanner.nextLine();
        System.out.println("Please input NEW ADDRESS");
        String companyAddress = scanner.nextLine();
        System.out.println("Please input NEW E-MAIL");
        String companyEmail = scanner.nextLine();
        System.out.println("Please input NEW PHONE");
        String companyPhone = scanner.nextLine();
        companyStorageById.setName(companyName);
        companyStorageById.setAddress(companyAddress);
        companyStorageById.setEmail(companyEmail);
        companyStorageById.setPhone(companyPhone);
        System.out.println("Company data is changed !!!");

    }

    private static void searchEmployeeByCompany() {
        companyStorage.print();
        System.out.println("Please input COMPANY Id");
        String companyId = scanner.nextLine();
        Company byId = companyStorage.getById(companyId);
        if (byId == null) {
            System.out.println("Company with " + companyId + " Id does not existed");
        } else {
            employeeStorage.searchEmployee(byId);
        }
    }

    private static void searchEmployeeById() {
        System.out.println("Please input EMPLOYEE Id");
        String employeeId = scanner.nextLine();
        Employee byId = employeeStorage.getById(employeeId);
        if (byId == null) {
            System.out.println("Employee with " + employeeId + " Id does not existed !!!");
        } else {
            System.out.println(byId);
        }

    }

    private static void addEmployee() {
        System.out.println("Please input COMPANY");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " Id does not exist");
            return;
        }
        System.out.println("Please input EMPLOYEE Id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage != null) {
            System.out.println("Employee with " + employeeId + " Id have already existed !!!");
            return;
        }
        System.out.println("Please input NAME");
        String employeeName = scanner.nextLine();
        System.out.println("Please input SURNAME");
        String employeeSurname = scanner.nextLine();
        System.out.println("Please input PHONE");
        String employeePhone = scanner.nextLine();
        System.out.println("Please input POSITION");
        String employeePosition = scanner.nextLine();
        System.out.println("Please input SALARY");
        Double employeeSalary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeId, employeeName, employeeSurname, employeePhone, employeePosition, companyFromStorage, employeeSalary);
        employeeStorage.add(employee);
        System.out.println("Employee is added !!!");
    }

    private static void addCompany() {
        System.out.println("Please input Id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyId + " id have already existed");
            return;
        }
        System.out.println("Please input NAME");
        String companyName = scanner.nextLine();
        System.out.println("Please input ADDRESS");
        String companyAddress = scanner.nextLine();
        System.out.println("Please input E-MAIL");
        String companyEmail = scanner.nextLine();
        System.out.println("Please input PHONE");
        String companyPhone = scanner.nextLine();
        Company company = new Company(companyId, companyName, companyAddress, companyEmail, companyPhone);
        companyStorage.add(company);
        System.out.println("Company is added !!!");

    }

    private static void printCommands() {

        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD COMPANY");
        System.out.println("Please input 2 for ADD EMPLOYEE");
        System.out.println("Please input 3 for PRINT ALL COMPANY");
        System.out.println("Please input 4 for PRINT ALL EMPLOYEE");
        System.out.println("Please input 5 for SEARCH EMPLOYEE BY Id");
        System.out.println("Please input 6 for SEARCH EMPLOYEE BY COMPANY");
        System.out.println("Please input 7 for CHANGE COMPANY DATA BY Id");
        System.out.println("Please input 8 for CHANGE EMPLOYEE DATA");
        System.out.println("Please input 9 for DELETE EMPLOYEE");
        System.out.println("Please input 10 for DELETE COMPANY");
    }
}
