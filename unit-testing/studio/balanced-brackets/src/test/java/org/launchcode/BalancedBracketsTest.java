package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Candied]Apples"));
    }

    @Test
    public void stringBalancedFourBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("you're[my][cinnamon]apple"));
    }

    @Test
    public void reversedOnlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unbalancedThreeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

    @Test
    public void stringUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Apples]and [cinnamon"));
    }

}