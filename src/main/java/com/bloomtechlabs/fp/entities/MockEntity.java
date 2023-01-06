package com.bloomtechlabs.fp.entities;

import javax.persistence.*;

/**
 * Mock postgresql table for migration, POC, and testing purposes.
 */
@Entity
@Table(name = "mock_table")
public class MockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;
    
    public MockEntity() {}

    public MockEntity(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private Long getId() { return id; }
    private MockEntity setId(Long id) {
        this.id = id;
        return this;
    }
    
    private String getName() { return name; }
    private MockEntity setName(String name) {
        this.name = name;
        return this;
    }
    
    private int getAge() { return age; }
    private MockEntity setAge(int age) {
        this.age = age;
        return this;
    }
    
    private String getAddress() { return address; }
    private MockEntity setAddress(String address) {
        this.address = address;
        return this;
    }
}
