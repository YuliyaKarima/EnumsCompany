import Company.Company;

/**
 * Tests using of enum types
 */
public class CompanyTest {
    public static void main(String[] args) {
        //initializing objects of enum
        Company appleCompany = Company.APPLE;
        Company samsungCompany = Company.SAMSUNG;
        //using enum's methods
        appleCompany.printNotebookList();
        appleCompany.printMobileDeviceList();
        samsungCompany.printMobileDeviceList();
        samsungCompany.printNotebookList();
    }
}
