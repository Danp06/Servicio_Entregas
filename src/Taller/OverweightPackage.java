package Taller;

public class OverweightPackage extends Package {
    public float overweight;

    public OverweightPackage(String id, String description, int code, float gramsPrice, float basePrice, float weight, Customer customer) {
        super(id, description, code, gramsPrice, basePrice, weight, customer);
    }

    public float getOverweight() {
        return overweight;
    }

    public void setOverweight(float overweight) {
        this.overweight = overweight;
    }

    @Override
    public String toString() {
        return "OverweightPackage{" + "overweight=" + overweight + '}';
    }

    public float calculate(float a, float b, float c) {
        return (a*b)+c;
    }
}
