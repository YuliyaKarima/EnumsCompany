package Notebook;

import DeviceService.ConnectAndroid;
import Company.Company;

/**
 * Concrete MobileDevice realization for mobile devices of Samsung
 */
public class SamsungNotebook extends Notebook implements ConnectAndroid {

    public SamsungNotebook(String name, double price) {
        super(name, price, Company.SAMSUNG);
    }

    @Override
    public void connectToGooglePlay() {
        connect();
        System.out.println("Connect to Google Play");
    }
}
