package com.soranet.controllers;

import com.soranet.model.CustomerModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class CustomerController {

    private final List<CustomerModel> customerList;

    public CustomerController() {
        customerList = new ArrayList<>();
        addDummyData();
    }

    // Add new customer
    public boolean addCustomer(String name, String email, String phoneNumber, String internetPlan, String speed, String price) {
        CustomerModel newCustomer = new CustomerModel(name, email, phoneNumber, internetPlan, speed, price);
        customerList.add(newCustomer);
        System.out.println(newCustomer.getCustomerId());
        return true;
    }

    // Update existing customer
    public boolean updateCustomer(String customerId, String name, String phoneNumber, String internetPlan, String speed, String price) {
        for (CustomerModel customer : customerList) {
            if (customer.getCustomerId().equals(customerId)) {
                customer.setName(name);
                customer.setPhoneNumber(phoneNumber);
                customer.setInternetPlan(internetPlan);
                customer.setSpeed(speed);
                customer.setPrice(price);
                return true;
            }
        }
        return false;
    }

    // Get all customers
    public List<CustomerModel> getAllCustomers() {
        return customerList;
    }

    // Find customer by ID
    public CustomerModel getCustomerById(String customerId) {
        for (CustomerModel customer : customerList) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    // Delete customer by ID
    public boolean deleteCustomerById(String customerId) {
        return customerList.removeIf(customer -> customer.getCustomerId().equals(customerId));
    }

    private void addDummyData() {
        // Adding some dummy customer data
        customerList.add(new CustomerModel( UUID.randomUUID().toString().substring(0, 8),"John Doe", "johndoe@example.com", "1234567890", "Basic Plan", "50 Mbps", "RS 1000"));
        customerList.add(new CustomerModel( UUID.randomUUID().toString().substring(0, 8),"Jane Smith", "janesmith@example.com", "0987654321", "Premium Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Alice Johnson", "alicejohnson@example.com", "1122334455", "Basic Plan", "50 Mbps", "RS 1000"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Bob Brown", "bobbrown@example.com", "6677889900", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Charlie White", "charliewhite@example.com", "4455667788", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel( UUID.randomUUID().toString().substring(0, 8),"John Doe", "johndoe@example.com", "1234567890", "Basic Plan", "50 Mbps", "RS 1000"));
        customerList.add(new CustomerModel( UUID.randomUUID().toString().substring(0, 8),"Jane Smith", "janesmith@example.com", "0987654321", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Alice Johnson", "alicejohnson@example.com", "1122334455", "Basic Plan", "50 Mbps", "RS 1000"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Bob Brown", "bobbrown@example.com", "6677889900", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Charlie White", "charliewhite@example.com", "4455667788", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel( UUID.randomUUID().toString().substring(0, 8),"John Doe", "johndoe@example.com", "1234567890", "Basic Plan", "50 Mbps", "RS 1000"));
        customerList.add(new CustomerModel( UUID.randomUUID().toString().substring(0, 8),"Jane Smith", "janesmith@example.com", "0987654321", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Alice Johnson", "alicejohnson@example.com", "1122334455", "Basic Plan", "50 Mbps", "RS 1000"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Bob Brown", "bobbrown@example.com", "6677889900", "Standard Plan", "150 Mbps", "RS 1500"));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8),"Charlie White", "charliewhite@example.com", "4455667788", "Standard Plan", "150 Mbps", "RS 1500"));
    }
}
 