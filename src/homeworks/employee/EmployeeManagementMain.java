package homeworks.employee;

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
                    searchEmployeeByID();
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
        System.out.println("Please choose COMPANY ID FOR DELETE");
        String companyID = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyID);

        if (companyStorageById == null){
            System.out.println("Company with " + companyID + " ID does not existed");
            return;
        }
        employeeStorage.deleteEmployeeByCompany(companyStorageById);
        companyStorage.deleteCompany(companyStorageById);

    }

    private static void deleteEmployee() {
        companyStorage.print();
        System.out.println("Please input COMPANY ID");
        String companyID = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyID);

        if (companyStorageById == null) {
            System.out.println("Company with " + companyID + " ID does not existed");
            return;
        }

        employeeStorage.searchEmployee(companyStorageById);

        System.out.println("Please input EMPLOYEE ID");
        String employeeID = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getByID(employeeID);

        if (employeeFromStorage == null) {
            System.out.println("Employee with " + employeeID + " ID does not existed !!!");
            return;
        }

        if (!employeeFromStorage.getCompany().equals(companyStorageById)){
            System.out.println("Please input FULL ID");
        }

        employeeStorage.deleteEmployee(employeeFromStorage);
    }

    private static void changeEmployee() {
        companyStorage.print();
        System.out.println("Please input COMPANY ID");
        String companyID = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyID);

        if (companyStorageById == null) {
            System.out.println("Company with " + companyID + " ID does not existed");
            return;
        }

        employeeStorage.searchEmployee(companyStorageById);

        System.out.println("Please input EMPLOYEE ID");
        String employeeID = scanner.nextLine();
        Employee employeeStorageByID = employeeStorage.getByID(employeeID);
        if (employeeStorageByID == null) {
            System.out.println("Employee with " + employeeID + " ID does not existed !!!");
            return;
        }

        if (!employeeStorageByID.getCompany().equals(companyStorageById)){
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
        employeeStorageByID.setName(employeeName);
        employeeStorageByID.setSurname(employeeSurname);
        employeeStorageByID.setPhone(employeePhone);
        employeeStorageByID.setPosition(employeePosition);
        employeeStorageByID.setSalary(employeeSalary);
        System.out.println("Employee data is changed !!!");

    }

    private static void changeCompany() {
        System.out.println("Please choose COMPANY ID");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company companyStorageById = companyStorage.getById(companyID);

        if (companyStorageById == null) {
            System.out.println("Company with " + companyID + " ID does not existed");
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
        System.out.println("Please input COMPANY ID");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company byId = companyStorage.getById(companyID);
        if (byId == null) {
            System.out.println("Company with " + companyID + " ID does not existed");
        } else {
            employeeStorage.searchEmployee(byId);
        }
    }

    private static void searchEmployeeByID() {
        System.out.println("Please input EMPLOYEE ID");
        String employeeID = scanner.nextLine();
        Employee byID = employeeStorage.getByID(employeeID);
        if (byID == null) {
            System.out.println("Employee with " + employeeID + " ID does not existed !!!");
        } else {
            System.out.println(byID);
        }

    }

    private static void addEmployee() {
        System.out.println("Please input COMPANY");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " ID does not exist");
            return;
        }
        System.out.println("Please input EMPLOYEE ID");
        String employeeID = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getByID(employeeID);
        if (employeeFromStorage != null) {
            System.out.println("Employee with " + employeeID + " ID have already existed !!!");
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
        Employee employee = new Employee(employeeID, employeeName, employeeSurname, employeePhone, employeePosition, companyFromStorage, employeeSalary);
        employeeStorage.add(employee);
        System.out.println("Employee is added !!!");
    }

    private static void addCompany() {
        System.out.println("Please input ID");
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyID + " id have already existed");
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
        Company company = new Company(companyID, companyName, companyAddress, companyEmail, companyPhone);
        companyStorage.add(company);
        System.out.println("Company is added !!!");

    }

    private static void printCommands() {

        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD COMPANY");
        System.out.println("Please input 2 for ADD EMPLOYEE");
        System.out.println("Please input 3 for PRINT ALL COMPANY");
        System.out.println("Please input 4 for PRINT ALL EMPLOYEE");
        System.out.println("Please input 5 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 6 for SEARCH EMPLOYEE BY COMPANY");
        System.out.println("Please input 7 for CHANGE COMPANY DATA BY ID");
        System.out.println("Please input 8 for CHANGE EMPLOYEE DATA");
        System.out.println("Please input 9 for DELETE EMPLOYEE");
        System.out.println("Please input 10 for DELETE COMPANY");
    }
}
