package Taller;

public class Package {
    public String id, description;
    public int code;
    public float gramsPrice, basePrice, weight;
    Customer customer;

    public Package(String id, String description, int code, float gramsPrice, float basePrice, float weight, Customer customer) {
        this.id = id;
        this.description = description;
        this.code = code;
        this.gramsPrice = gramsPrice;
        this.basePrice = basePrice;
        this.weight = weight;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getGramsPrice() {
        return gramsPrice;
    }

    public void setGramsPrice(float gramsPrice) {
        this.gramsPrice = gramsPrice;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Package{" + "id=" + id + ", description=" + description + ", code=" + code + ", gramsPrice=" + gramsPrice + ", basePrice=" + basePrice + ", weight=" + weight + ", customer=" + customer + '}';
    }
    
    public float calculate(float a, float b){
        return a*b;
    }
}
