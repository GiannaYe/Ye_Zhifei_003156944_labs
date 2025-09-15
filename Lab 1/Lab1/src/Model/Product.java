/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yzf01
 */
public class Product {
    String name;
    String description;
    String availNum;
    String price;
    Address manufactureAddress;
    Address manufactureShippingAddress;

    public Product() {
        manufactureAddress = new Address();
        manufactureShippingAddress = new Address();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Address getManufactureAddress() {
        return manufactureAddress;
    }

    public void setManufactureAddress(Address manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public Address getManufactureShippingAddress() {
        return manufactureShippingAddress;
    }

    public void setManufactureShippingAddress(Address manufactureShippingAddress) {
        this.manufactureShippingAddress = manufactureShippingAddress;
    }

    
}
