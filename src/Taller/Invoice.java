package Taller;


public class Invoice {
    public String id;
    public float tax, price, discoint;
    public Order orders;
    public InvoiceStatus status;
    public Customer client;
    public PaymentMethodsTypes paymentMethod;

    public Invoice(String id, float tax, float price, float discoint, Order orders, InvoiceStatus status, Customer client, PaymentMethodsTypes paymentMethod) {
        this.id = id;
        this.tax = tax;
        this.price = price;
        this.discoint = discoint;
        this.orders = orders;
        this.status = status;
        this.client = client;
        this.paymentMethod = paymentMethod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscoint() {
        return discoint;
    }

    public void setDiscoint(float discoint) {
        this.discoint = discoint;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public PaymentMethodsTypes getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodsTypes paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", tax=" + tax + ", price=" + price + ", discoint=" + discoint + ", orders=" + orders + ", status=" + status + ", client=" + client + ", paymentMethod=" + paymentMethod + '}';
    }
    
}