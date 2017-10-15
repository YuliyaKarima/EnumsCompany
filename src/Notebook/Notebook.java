package Notebook;

import Device.Device;
import Company.Company;

/**
 * Realization of Device for definition of notebook.
 */
public abstract class Notebook extends Device {

    public Notebook(String name, double price, Company company) {
        super(name, price, company);
    }
}
