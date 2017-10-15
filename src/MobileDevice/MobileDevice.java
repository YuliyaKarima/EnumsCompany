package MobileDevice;

import DeviceService.Call;
import Device.Device;
import Company.Company;

import java.util.Map;

/**
 * Realization of Device for definition of mobile device.
 * Also implements interface Call for realization of methods of mobile communication
 */
public abstract class MobileDevice extends Device implements Call {
    private Map<String, String> phoneBook;

    public MobileDevice(String name, double price, Company company) {
        super(name, price, company);
    }

    public void call(String number) {

    }

    public void addPhone(String phone, String name) {
        phoneBook.put(phone, name);
    }
}
