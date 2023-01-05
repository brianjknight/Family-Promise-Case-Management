package com.bloomtechlabs.fp.tables;

import javax.persistence.*;

/**
 * Mock postgresql table for migration, POC, and testing purposes.
 */
@Entity
@Table(name = "mock_table")
public class MockTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;
    
    public MockTable() {}
    
    private int getId() { return id; }
    private MockTable setId(int id) {
        this.id = id;
        return this;
    }
    
    private String getName() { return name; }
    private MockTable setName(String name) {
        this.name = name;
        return this;
    }
    
    private int getAge() { return age; }
    private MockTable setAge(int age) {
        this.age = age;
        return this;
    }
    
    private String getAddress() { return address; }
    private MockTable setAddress(String address) {
        this.address = address;
        return this;
    }
}
