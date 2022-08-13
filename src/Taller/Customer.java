package Taller;

public class Customer extends Person {
    public Invoice invoices[];
    public Location shipping[];
    private CredictCard creditCards[];

    public Customer(Invoice[] invoices, Location[] shipping, CredictCard[] creditCards, String id, String nationalId, String idType, String name, String email, String lastName, Location location, PersonType personType) {
        super(id, nationalId, idType, name, email, lastName, location, personType);
        this.invoices = invoices;
        this.shipping = shipping;
        this.creditCards = creditCards;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public Location[] getShipping() {
        return shipping;
    }

    public void setShipping(Location[] shipping) {
        this.shipping = shipping;
    }

    public CredictCard[] getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(CredictCard[] creditCards) {
        this.creditCards = creditCards;
    }

    @Override
    public String toString() {
        return "Customer{" + "invoices=" + invoices + ", shipping=" + shipping + ", creditCards=" + creditCards + '}';
    }

    @Override
    public boolean biometricValidation() {
        return super.biometricValidation(); 
    }
    
    
}
