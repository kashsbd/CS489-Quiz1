package org.prakash.model;

import java.util.Objects;

public class EmailAddress {
    private String id;
    private String email;
    private String label;

    public EmailAddress(String id, String email, String label) {
        this.id = id;
        this.email = email;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(o instanceof EmailAddress that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getLabel(), that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail(), getLabel());
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
