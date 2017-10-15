package DeviceService;

/**
 * Interface provides methods for mobile communication
 */
public interface Call {
    /**
     * establishes a mobile connection with the number
     *
     * @param number Phone number
     */
    public void call(String number);

    /**
     * Writes a number in phone book
     *
     * @param phone phone number
     * @param name  phone number holder
     */
    public void addPhone(String phone, String name);
}

