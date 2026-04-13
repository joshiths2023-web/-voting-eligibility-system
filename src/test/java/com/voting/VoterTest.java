package com.voting;

import org.junit.Test;
import static org.junit.Assert.*;

public class VoterTest {
    @Test
    public void testEligibleVoter() {
        Voter v = new Voter("John", 25, "Indian", true);
        assertEquals("Eligible to Vote", v.checkEligibility());
    }

    @Test
    public void testUnderage() {
        Voter v = new Voter("Alice", 16, "Indian", true);
        assertEquals("Ineligible: Underage", v.checkEligibility());
    }

    @Test
    public void testNonCitizen() {
        Voter v = new Voter("Bob", 30, "US", true);
        assertEquals("Ineligible: Not a citizen", v.checkEligibility());
    }
}
