package Taller;

public class StandardPackage extends Package {
    public float quota;

    public StandardPackage(float quota, String id, String description, int code, float gramsPrice, float basePrice, float weight, Customer customer) {
        super(id, description, code, gramsPrice, basePrice, weight, customer);
        this.quota = quota;
    }
    
    public float getQuota() {
        return quota;
    }

    public void setQuota(float quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "StandardPackage{" + "quota=" + quota + '}';
    }

    public float calculate(float a, float b, float c) {
        return (a*b)+c;
    }

    
    
}
