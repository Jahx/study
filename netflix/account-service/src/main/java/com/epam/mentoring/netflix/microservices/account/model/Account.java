package com.epam.mentoring.netflix.microservices.account.model;

import java.util.Objects;

public class Account {

    private Integer id;
    private Integer customerId;
    private String number;

    public Account() {

    }

    public Account(Integer id, Integer customerId, String number) {
        this.id = id;
        this.customerId = customerId;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(customerId, account.customerId) &&
                Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, number);
    }
}
