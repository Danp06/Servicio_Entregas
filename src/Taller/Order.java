package Taller;

public class Order {
    public String id;
    public Package packages;
    public boolean paid;
    public float price;
    public Customer receiver, sender;
    public OrderStatus status;
    public Location location;

    public Order(String id, Package packages, boolean paid, float price, Customer receiver, Customer sender, OrderStatus status, Location location) {
        this.id = id;
        this.packages = packages;
        this.paid = paid;
        this.price = price;
        this.receiver = receiver;
        this.sender = sender;
        this.status = status;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Package getPackages() {
        return packages;
    }

    public void setPackages(Package packages) {
        this.packages = packages;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Customer getReceiver() {
        return receiver;
    }

    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", packages=" + packages + ", paid=" + paid + ", price=" + price + ", receiver=" + receiver + ", sender=" + sender + ", status=" + status + ", location=" + location + '}';
    }
}
