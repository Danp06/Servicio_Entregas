package Taller;

public class OverweightPackage extends Package {
    public float quota;

    public OverweightPackage(String id, String description, int code, float gramsPrice, float basePrice, float weight) {
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
        return "OverweightPackage{" + "quota=" + quota + '}';
    }
}
