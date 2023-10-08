package homeworks.employee;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (size == companies.length - 1) {
            extend();
        }
        companies[size++] = company;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, companies.length);
        companies = tmp;
    }

    public Company getById(String companyID) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getID().equals(companyID)) {
                return companies[i];
            }
        }
        return null;
    }

    public void deleteCompany(Company companyStorageById) {
        for (int i = 0; i < size; i++) {
            if (companies[i].equals(companyStorageById)) {
                for (int j = i; j < size - 1; j++) {
                    companies[i] = companies[i + 1];
                }
            }

        }
        size-- ;
    }
}
