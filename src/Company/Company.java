package Company;

import MobileDevice.*;
import Notebook.*;

public enum Company {
    APPLE("Apple") {
        public MobileDevice[] getMobileDevices() {
            MobileDevice[] devices = new MobileDevice[3];
            devices[0] = new AppleMobile("6", 400);
            devices[1] = new AppleMobile("7", 500);
            devices[2] = new AppleMobile("8", 600);
            return devices;
        }

        public Notebook[] getNotebooks() {
            Notebook[] devices = new Notebook[3];
            devices[0] = new AppleNotebook("7", 1200);
            devices[1] = new AppleNotebook("8", 1300);
            devices[2] = new AppleNotebook("9", 1600);
            return devices;
        }
    },
    SAMSUNG("Samsung") {
        public MobileDevice[] getMobileDevices() {
            MobileDevice[] devices = new MobileDevice[3];
            devices[0] = new SamsungMobile("Galaxy", 300);
            devices[1] = new SamsungMobile("Galaxy", 300);
            devices[2] = new SamsungMobile("Galaxy", 300);
            return devices;
        }

        public Notebook[] getNotebooks() {
            Notebook[] devices = new Notebook[3];
            devices[0] = new SamsungNotebook("Galaxy", 600);
            devices[1] = new SamsungNotebook("Galaxy", 600);
            devices[2] = new SamsungNotebook("Galaxy", 600);
            return devices;
        }
    };

    private String name;
    private MobileDevice[] mobileDevices;
    private Notebook[] notebooks;

    Company(String name) {
        this.name = name;
    }

    /**
     * Method outputs list of notebooks on the console
     */
    public void printNotebookList() {
        System.out.println("List of notebooks of " + name());
        for (Notebook notebook : getNotebooks()) {
            System.out.println(notebook);
        }
    }

    /**
     * Method outputs list of mobile devices on the console
     */
    public void printMobileDeviceList() {
        System.out.println("List of mobile devices of " + name());
        for (MobileDevice mobileDevice : getMobileDevices()) {
            System.out.println(mobileDevice);
        }
    }

    public abstract MobileDevice[] getMobileDevices();

    public abstract Notebook[] getNotebooks();

}
