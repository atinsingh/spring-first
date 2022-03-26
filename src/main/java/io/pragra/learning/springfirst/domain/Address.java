package io.pragra.learning.springfirst.domain;

public class Address {
    private String type;
    private String location;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

