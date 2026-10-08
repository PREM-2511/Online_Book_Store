package com.obs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    void validLoginShouldReturnTrue() {
        LoginService service = new LoginService();

        assertTrue(service.isValidLogin("prem", "password123"));
    }

    @Test
    void emptyUsernameShouldReturnFalse() {
        LoginService service = new LoginService();

        assertFalse(service.isValidLogin("", "password123"));
    }
}