package Taller;

public class Track {
    public String id;
    public float maxWeight, currentWeight;
    public TrackType type;
    public TrackStatus status;

    public Track(String id, float maxWeight, float currentWeight, TrackType type, TrackStatus status) {
        this.id = id;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public TrackType getType() {
        return type;
    }

    public void setType(TrackType type) {
        this.type = type;
    }

    public TrackStatus getStatus() {
        return status;
    }

    public void setStatus(TrackStatus status) {
        this.status = status;
    }
    
    
}
