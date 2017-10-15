package Notebook;

import DeviceService.ConnectApple;
import Company.Company;

/**
 * Concrete MobileDevice realization for notebook of Apple
 */
public class AppleNotebook extends Notebook implements ConnectApple {

    public AppleNotebook(String name, double price) {
        super(name, price, Company.APPLE);
    }

    @Override
    public void connectToAppStore() {
        connect();
    }
}
