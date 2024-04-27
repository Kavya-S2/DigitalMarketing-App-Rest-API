package com.example.digitgrow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Digit {

    @Id
    int serviceId;
    String serviceName;
    String serviceDescription;
    String productCategory;
    String packages;
    int price;
    int discount;
    String name;
    String customerid;
    String email;

    public Digit()

    {

    }

    public Digit(int serviceId, String serviceName, String serviceDescription, String productCategory, String packages,
            int price, int discount, String name, String customerid,String email) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.productCategory = productCategory;
        this.packages = packages;
        this.price = price;
        this.discount = discount;
        this.name = name;
        this.customerid = customerid;
        this.email = email;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}