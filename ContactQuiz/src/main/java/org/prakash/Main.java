package org.prakash;

import org.prakash.model.Contact;
import org.prakash.model.EmailAddress;
import org.prakash.model.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {

        List<Phone> p1 = new ArrayList<>();
        p1.add(new Phone("100","240-133-0011", "Home"));
        p1.add(new Phone("101","240-112-0123", "Mobile"));

        List<EmailAddress> e1 = new ArrayList<>();
        e1.add(new EmailAddress("200","dave.sang@gmail.com", "Home"));
        e1.add(new EmailAddress("201","dsanger@argos.com", "Work"));

        List<Phone> p2 = new ArrayList<>();
        p2.add(new Phone("103","412-116-9988", "Work"));

        List<EmailAddress> e2 = new ArrayList<>();
        e2.add(new EmailAddress("203","ali@bmi.com", "Work"));

        List<Contact> contacts = List.of(
                new Contact("301","David", "Sanger", "Argos LLC", "Sales Manager", p1, e1),
                new Contact("302","Carlos", "Jimenez", "Zappos", "Director"),
                new Contact("303","Ali", "Gafar", "BMI Services", "HR Manager", p2, e2)
        );

        List<Contact> sortedContacts = contacts.stream().sorted(Comparator.comparing(Contact::getLastName)).toList();

        //Print a contact with john format
        System.out.println("JSON format output: ");
        System.out.println(new Gson().toJson(sortedContacts));
    }
}