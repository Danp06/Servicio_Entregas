package Taller;

public class Position {
    public float lat, ing;

    public Position(float lat, float ing) {
        this.lat = lat;
        this.ing = ing;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getIng() {
        return ing;
    }

    public void setIng(float ing) {
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "Position{" + "lat=" + lat + ", ing=" + ing + '}';
    }
    
    
}
