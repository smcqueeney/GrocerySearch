package com.portfolio.seanmcqueeney.grocerysearch.Model;

public class product {
    public int id;
    public int isle;
    public String name, department;

    public product(int isle, String name, String department) {
        this.id = id;
        this.isle = isle;
        this.name = name;
        this.department = department;
    }

    public product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsle() {
        return isle;
    }

    public void setIsle(int isle) {
        this.isle = isle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
