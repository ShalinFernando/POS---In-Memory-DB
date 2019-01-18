package lk.ijse.dep.fx.util;

import lk.ijse.dep.fx.model.Customer;

import java.util.ArrayList;

public class ManageCustomers {

    // Database
    private static ArrayList<Customer> customersDB = new ArrayList<>();

    public static ArrayList<Customer> getCustomersDB(){
        return customersDB;
    }

    public static void setCustomersDB(ArrayList<Customer> customers){
        customersDB = customers;
    }

    // Dummy Data
    static{
        customersDB.add(new Customer("C001","Kasun","Galle"));
        customersDB.add(new Customer("C002","Ranga","Panadura"));
        customersDB.add(new Customer("C003","Nuwan","Kagalle"));
        customersDB.add(new Customer("C004","Kasun","Matara"));
    }

    public static void createCustomer(Customer customer){
        customersDB.add(customer);
    }

    public static void updateCustomer(int index, Customer customer){
        customersDB.get(index).setName(customer.getName());
        customersDB.get(index).setAddress(customer.getAddress());
    }

    public static void deleteCustomer(int index){
        customersDB.remove(index);
    }

    public static Customer findCustomer(String id){
        for (Customer customer : customersDB) {
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }

}
