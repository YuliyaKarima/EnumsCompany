package MobileDevice;

import DeviceService.ConnectApple;
import Company.Company;

/**
 *Concrete MobileDevice realization for mobile devices of Apple
 */
public class AppleMobile extends MobileDevice implements ConnectApple {

    public AppleMobile(String name, double price){
        super(name, price, Company.APPLE);
    }

    @Override
    public void connectToAppStore() {
    connect();
        System.out.println("Connect to App Store");
    }

    @Override
    public boolean isConnectedToInternet() {
        return false;
    }
}