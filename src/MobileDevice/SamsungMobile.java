package MobileDevice;

import DeviceService.ConnectAndroid;
import Company.Company;

/**
 * Concrete MobileDevice realization for mobile devices of Samsung
 */
public class SamsungMobile extends MobileDevice implements ConnectAndroid {

    public SamsungMobile(String name, double price) {
        super(name, price, Company.SAMSUNG);
    }

    @Override
    public void connectToGooglePlay() {
        connect();
        System.out.println("Connect to Google Play");
    }
}
