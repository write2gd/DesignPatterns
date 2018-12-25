package com.gd.dependencyinversion.good;

public interface CustomerDao {

    Customer getById(int id) throws Exception;

    boolean add(Customer customer) throws Exception;

    boolean update(Customer customer) throws Exception;

    boolean delete(Customer customer) throws Exception;
}
