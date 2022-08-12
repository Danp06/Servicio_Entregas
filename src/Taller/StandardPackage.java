package Taller;

public class StandardPackage extends Package {
    public float overweight;

    public StandardPackage(String id, String description, int code, float gramsPrice, float basePrice, float weight) {
        super(id, description, code, gramsPrice, basePrice, weight);
    }

    public float getOverweight() {
        return overweight;
    }

    public void setOverweight(float overweight) {
        this.overweight = overweight;
    }

    @Override
    public String toString() {
        return "StandardPackage{" + "overweight=" + overweight + '}';
    } 
}
