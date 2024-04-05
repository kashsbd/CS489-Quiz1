package org.prakash.model;

import java.util.Objects;

public class Phone {
    private String id;
    private String phNumber;
    private String label;

    public Phone(String id, String phNumber, String label) {
        this.id = id;
        this.phNumber = phNumber;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;
        return Objects.equals(getId(), phone.getId()) && Objects.equals(getPhNumber(), phone.getPhNumber()) && Objects.equals(getLabel(), phone.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPhNumber(), getLabel());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", phNumber='" + phNumber + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
