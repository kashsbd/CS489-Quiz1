package org.prakash;

import org.prakash.model.Contact;
import org.prakash.model.EmailAddress;
import org.prakash.model.Phone;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {

        List<Phone> p1 = new ArrayList<>();
        p1.add(new Phone("100","641-233-8769", "Mobile"));
        p1.add(new Phone("101","211-655-1908", "Home"));
        p1.add(new Phone("102","344-788-1421", "Work"));

        List<EmailAddress> e1 = new ArrayList<>();
        e1.add(new EmailAddress("200","jhon@gmail.com", "Personal"));
        e1.add(new EmailAddress("201","jhon@miu.edu", "School"));
        e1.add(new EmailAddress("202","jhon@global.com", "Job"));

        Contact contact = new Contact("301","John", "Smith", "Global Ltd", "Senior Software Engineer", p1, e1);

        //Print a contact with john format
        System.out.println("JSON format output: ");
        System.out.println(new Gson().toJson(contact));
    }
}