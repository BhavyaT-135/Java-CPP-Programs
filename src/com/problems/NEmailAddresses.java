//Given n email addresses of different domains,please send an email to the first address(in alphabetical order)of each domain.Please assume a function sendmail()to send the emails.(note:give general solution).Input Array=['ghi@hotmail.com','def@yahoo.com','ghi@gmail.com','abc@channelier.com','abc@hotmail.com','def@hotmail.com','abc@gmail.com','abc@yahoo.com','def@channelier.com','jkl@hotmail.com','ghi@yahoo.com','def@gmail.com'].

// Expected Output-Below is the order of address in which sendmail function is going to send mail.abc@channelier.com
//                                 abc@yahoo.com
//                                 abc@gmail.com
//                                 abc@hotmail.com

package com.problems;

public class NEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {
            "ghi@hotmail.com","def@yahoo.com","ghi@gmail.com","abc@channelier.com","abc@hotmail.com","def@hotmail.com","abc@gmail.com","abc@yahoo.com","def@channelier.com","jkl@hotmail.com","ghi@yahoo.com","def@gmail.com"
        };
        sendMail(emails);
    }

    public static void sendMail(String[] emails) {
        // Sort the emails
        for (int i = 0; i < emails.length; i++) {
            for (int j = i + 1; j < emails.length; j++) {
                if (emails[i].compareTo(emails[j]) > 0) {
                    String temp = emails[i];
                    emails[i] = emails[j];
                    emails[j] = temp;
                }
            }
        }

        // Find unique domains
        String[] domains = new String[emails.length];
        int domainCount = 0;
        for (int i = 0; i < emails.length; i++) {
            String domain = emails[i].substring(emails[i].indexOf('@') + 1);
            boolean isUnique = true;
            for (int j = 0; j < domainCount; j++) {
                if (domain.equals(domains[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                domains[domainCount] = domain;
                domainCount++;
            }
        }

        // Print the first email of each domain
        for (int i = 0; i < domainCount; i++) {
            for (int j = 0; j < emails.length; j++) {
                if (emails[j].contains(domains[i])) {
                    System.out.println(emails[j]);
                    break;
                }
            }
        }
    }
}
