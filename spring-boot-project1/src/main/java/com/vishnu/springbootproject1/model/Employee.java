package com.vishnu.springbootproject1.model;

public class Employee {

    private String empId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;

    public Employee() {
    }

    public Employee(String empId, String firstName, String lastName, String emailId, String department) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.department = department;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
