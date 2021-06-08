public class guest extends Customer{
    public guest(String fullName, String address, String phoneNumber, float moneyNumber, float discountNumber, float taxNumber) {
        super(fullName, address, phoneNumber, moneyNumber, discountNumber, taxNumber);
    }

    public float CalculateTheAmount(){
        return this.getMoneyNumber() - this.getDiscountNumber() + this.getTaxNumber()*this.getMoneyNumber();
    }
}
