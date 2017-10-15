package Device;

import Company.Company;
import DeviceService.ConnectToWeb;
import Electronics.Electronics;

/**
 * Encapculates device parameters
 */
public abstract class Device implements Electronics, ConnectToWeb {
    private String name;
    private double price;
    private boolean isOn;
    private boolean isConnectedToInternet;
    private Company company;

    public Device(String name, double price, Company company) {
        this.name = name;
        this.price = price;
        this.company = company;
        isOn = false;
        isConnectedToInternet = false;
    }

    @Override
    public void connect() {
        if (isOn) {
            System.out.println("Connect to Internet");
        }
        isConnectedToInternet = true;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isConnectedToInternet = false;
        isOn = false;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Company: " + company.name()
                + "\n" + "Price: $" + price;
    }

    public boolean isConnectedToInternet() {
        return isConnectedToInternet;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
