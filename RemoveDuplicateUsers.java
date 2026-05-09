package INTERVIEW;

import java.util.*;

public class RemoveDuplicateUsers {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "prabhakaran11210@gmail.com",
                "jeeva47065@gmail.com",
                "prabhakaran11210@gmail.com",
                "manojk45702@gmail.com"
        );

        Set<String> uniqueEmails = new HashSet<>(emails);

        System.out.println("Unique Emails are :");
        for(String email : uniqueEmails) {
            System.out.println(email);
        }
    }
}