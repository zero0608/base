public class Customer {
    private String fullName;
    private String address;
    private String phoneNumber;
    private float moneyNumber;
    private float discountNumber;
    private float taxNumber;
    public Customer() {
    }

    public Customer(String fullName, String address, String phoneNumber, float moneyNumber, float discountNumber,
                    float taxNumber) {
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.moneyNumber = moneyNumber;
        this.discountNumber = discountNumber;
        this.taxNumber = taxNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", moneyNumber=" + moneyNumber +
                ", discountNumber=" + discountNumber +
                ", taxNumber=" + taxNumber +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(float moneyNumber) {
        this.moneyNumber = moneyNumber;
    }

    public float getDiscountNumber() {
        return discountNumber;
    }

    public void setDiscountNumber(float discountNumber) {
        this.discountNumber = discountNumber;
    }

    public float getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(float taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
