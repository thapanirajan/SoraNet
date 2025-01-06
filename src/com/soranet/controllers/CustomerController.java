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
        returnEarnings();
    }

    // Add new customer
    public boolean addCustomer(String name, String email, String phoneNumber, String internetPlan, String speed, int price) {
        CustomerModel newCustomer = new CustomerModel(name, email, phoneNumber, internetPlan, speed, price);
        customerList.add(newCustomer);
        return true;
    }

    // Update existing customer
    public boolean updateCustomer(String customerId, String name, String phoneNumber, String internetPlan, String speed, int price) {
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

    public int returnSize() {
        return customerList.size();
    }

    // Delete customer by ID
    public boolean deleteCustomerById(String customerId) {
        return customerList.removeIf(customer -> customer.getCustomerId().equals(customerId));
    }

    public final int returnEarnings() {
        List<CustomerModel> customers = getAllCustomers();
        int totalIncome = 0;
        for (CustomerModel customList : customers) {
            totalIncome = totalIncome + customList.getPrice();
        }
        return totalIncome;
    }

    private void addDummyData() {
        // Adding some dummy customer data
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Alice Smith", "alice.smith@example.com", "9876543210", "Standard Plan", "150 Mbps", 1500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Michael Johnson", "michael.j@example.com", "9123456789", "Basic Plan", "50 Mbps", 1000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Sophia Brown", "sophia.b@example.com", "9988776655", "Premium Plan", "250 Mbps", 2500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Liam Wilson", "liam.w@example.com", "9876501234", "Ultra Plan", "500 Mbps", 5000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Olivia Taylor", "olivia.t@example.com", "9876544321", "Standard Plan", "150 Mbps", 1500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Noah Anderson", "noah.a@example.com", "9900112233", "Basic Plan", "50 Mbps", 1000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Isabella Martinez", "isabella.m@example.com", "9911223344", "Premium Plan", "250 Mbps", 2500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "James Thomas", "james.t@example.com", "9922334455", "Ultra Plan", "500 Mbps", 5000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Amelia Hernandez", "amelia.h@example.com", "9800112233", "Standard Plan", "150 Mbps", 1500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Ethan Garcia", "ethan.g@example.com", "9811223344", "Basic Plan", "50 Mbps", 1000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Mia Davis", "mia.d@example.com", "9822334455", "Premium Plan", "250 Mbps", 2500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Lucas Robinson", "lucas.r@example.com", "9833445566", "Ultra Plan", "500 Mbps", 5000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Charlotte Clark", "charlotte.c@example.com", "9844556677", "Standard Plan", "150 Mbps", 1500));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Elijah Rodriguez", "elijah.r@example.com", "9855667788", "Basic Plan", "50 Mbps", 1000));
        customerList.add(new CustomerModel(UUID.randomUUID().toString().substring(0, 8), "Harper Lewis", "harper.l@example.com", "9866778899", "Premium Plan", "250 Mbps", 2500));
    }

}
