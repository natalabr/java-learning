package Package02;

public class Program {
    public static void main(String[] args) {

        Bank ubs = new Bank("USB");
        Bank stGallenBank = new Bank("St Gallen Bank");

        Customer customer1 = new Customer("John");
        ubs.addCustomer(customer1);
        ubs.issueCard(CardType.CREDIT, customer1);

        Shop shop1 = new Shop("Coop");
        //shop1.pay();
    }
}
