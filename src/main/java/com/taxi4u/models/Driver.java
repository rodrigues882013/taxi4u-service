package com.taxi4u.models;


public class Driver {
    private String name;
    private String phone;

    public Driver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Driver(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (name != null ? !name.equals(driver.name) : driver.name != null) return false;
        return phone != null ? phone.equals(driver.phone) : driver.phone == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
