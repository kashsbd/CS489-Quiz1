package org.prakash.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String companyName;
    private String jobTitle;
    private List<Phone> phoneList;
    private List<EmailAddress> emailAddressList;

    public Contact(String id, String firstName, String lastName, String companyName, String jobTitle, List<Phone> phoneList, List<EmailAddress> emailAddressList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.phoneList = phoneList;
        this.emailAddressList = emailAddressList;
    }

    public Contact(String id, String firstName, String lastName, String companyName, String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.phoneList = new ArrayList<>();
        this.emailAddressList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailAddress> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getId(), contact.getId()) && Objects.equals(getFirstName(), contact.getFirstName()) && Objects.equals(getLastName(), contact.getLastName()) && Objects.equals(getCompanyName(), contact.getCompanyName()) && Objects.equals(getJobTitle(), contact.getJobTitle()) && Objects.equals(getPhoneList(), contact.getPhoneList()) && Objects.equals(getEmailAddressList(), contact.getEmailAddressList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getCompanyName(), getJobTitle(), getPhoneList(), getEmailAddressList());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneList=" + phoneList +
                ", emailAddressList=" + emailAddressList +
                '}';
    }
}
