package com.gd.dependencyinversion.bad;

public interface CustomerDao {

    Customer getById(int id) throws Exception;

    boolean add(Customer customer) throws Exception;

    boolean update(Customer customer) throws Exception;

    boolean delete(Customer customer) throws Exception;
}
