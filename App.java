package com.jayasri;

public class App {
    public static void main(String[] args) {
        Property property = new Property();
        property.setAddress("456 Oak Lane");
        property.setRent(1400.00);
        property.setAvailable(true);

        PropertyDAO dao = new PropertyDAO();
        dao.save(property);

        System.out.println("Property saved successfully!");
    }
}
