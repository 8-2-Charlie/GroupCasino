package com.github.zipcodewilmington.TestCasinoAccountManager;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class TestCasinoAccountManager {

    @Test
    public void testRegisterAccount(){
        CasinoAccount casinoMember = new CasinoAccount("John","John123");
        CasinoAccountManager casinoAccountManagerMember = new CasinoAccountManager();
        System.out.print(casinoAccountManagerMember.createAccount(casinoMember.getUsername(),casinoMember.getPassword()));
    }
}
