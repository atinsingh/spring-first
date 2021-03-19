package io.pragra.learning.springfirst.domain;

public class Address {
    private String addressType;
    private String location;

    public Address(String addresstype, String location) {
        this.addressType = addresstype;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressType='" + addressType + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
