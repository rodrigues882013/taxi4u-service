package com.taxi4u.models;

/**
 * Created by felipe on 05/02/17.
 */
public class Ride {
    private String destination;
    private Double price;
    private Driver driver;
    private User user;
    private Long datetime;


    public Ride(String destination, Driver driver, User user, Long datetime) {
        this.destination = destination;
        this.driver = driver;
        this.user = user;
        this.datetime = datetime;
    }

    public Ride(){}

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ride ride = (Ride) o;

        if (!destination.equals(ride.destination)) return false;
        if (price != null ? !price.equals(ride.price) : ride.price != null) return false;
        if (!driver.equals(ride.driver)) return false;
        if (!user.equals(ride.user)) return false;
        return datetime.equals(ride.datetime);

    }

    @Override
    public int hashCode() {
        int result = destination.hashCode();
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + driver.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + datetime.hashCode();
        return result;
    }
}
