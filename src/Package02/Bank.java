package Package02;

import java.util.ArrayList;

public class Bank {

    String _name;

    public Bank(String name) {
        _name = name;
    }

    private ArrayList<Card> cards = new ArrayList<Card>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Card issueCard(CardType cardType, Customer customer) {

        Card card = switch (cardType) {
            case CardType.CREDIT -> new CreditCard(this);
            case CardType.DEBIT -> new DebitCard(this);
            case CardType.PREPAID -> new PrepaidCard(this);
        };

        cards.add(card);
        return card;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
