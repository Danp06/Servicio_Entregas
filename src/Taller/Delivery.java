package Taller;

public class Delivery {
    public Order order[];
    public DeliveryStatus status;
    public Track track;
    public Internal driver;
    public Position position;

    public Delivery(Order[] order, DeliveryStatus status, Track track, Internal driver, Position position) {
        this.order = order;
        this.status = status;
        this.track = track;
        this.driver = driver;
        this.position = position;
    }

    public Order[] getOrder() {
        return order;
    }

    public void setOrder(Order[] order) {
        this.order = order;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Internal getDriver() {
        return driver;
    }

    public void setDriver(Internal driver) {
        this.driver = driver;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    public Position watchPositon(){
        Position coor = null;
        return coor;
    }
    
    public Position getCurrentPosition(){
        Position coor = null;
        return coor;
    }
    
    private void setCurrentPosition(Position position){
        this.position = position;
    }
    
}
