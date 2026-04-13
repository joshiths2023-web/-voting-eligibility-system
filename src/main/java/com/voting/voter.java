package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private boolean hasValidID;

    public Voter(String name, int age, String citizenship, boolean hasValidID) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.hasValidID = hasValidID;
    }

    public String checkEligibility() {
        if (age < 18) return "Ineligible: Underage";
        if (!citizenship.equalsIgnoreCase("Indian")) return "Ineligible: Not a citizen";
        if (!hasValidID) return "Ineligible: Invalid Voter ID";
        return "Eligible to Vote";
    }
}
