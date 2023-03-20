package com.restapi.firstapi.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int age;

    @Column
    private String email;

    @CreationTimestamp
    private Date createdAt;
    
    @CreationTimestamp
    private Date updatedAt;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        if (id == 0){
            return;
        }
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName == null){
            return;
        }
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName == null){
            return;
        }
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age == 0) {
            return;
        }
        this.age = age;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email == null ) {
            return;
        }
        this.email = email;
    }


    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    
}
