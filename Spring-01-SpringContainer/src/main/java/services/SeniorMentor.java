package services;

import interfaces.Mentor;

public class SeniorMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Senior Mentor Account is created...");
    }
}
