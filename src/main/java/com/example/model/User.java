package com.example.model;

import com.example.enums.Country;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Country country;

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }
}