package Taller;

public class StandardPackage extends Package {
    public float quota;

    public StandardPackage(String id, String description, int code, float gramsPrice, float basePrice, float weight) {
        super(id, description, code, gramsPrice, basePrice, weight);
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
