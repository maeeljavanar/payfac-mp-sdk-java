package com.mp.sdk.functionalTest;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.mp.sdk.Communication;
import com.mp.sdk.Configuration;
import com.mp.sdk.LegalEntityPrincipal;
import com.mp.sdk.PayFacPrincipal;
import com.mp.sdk.PrincipalAddress;
import com.mp.sdk.PrincipalCreateResponse;
import com.mp.sdk.PrincipalDeleteResponse;

public class TestPayFacPrincipal {
    PayFacPrincipal payFacPrincipal;
    PayFacPrincipal payFacPrincipal2;
    Configuration configuration;
    Properties config;
    Communication communication;
    LegalEntityPrincipal principal;
    PrincipalAddress address;
    Date date = new Date();
    Calendar calendar;


    @Before
    public void setUp(){
        communication = new Communication();
        configuration = new Configuration();
        config = configuration.getProperties();
        payFacPrincipal = new PayFacPrincipal();
        payFacPrincipal2 = new PayFacPrincipal(config);
        principal = new LegalEntityPrincipal();

        address = new PrincipalAddress();
        address.setStreetAddress1("Street Address 1");
        address.setStreetAddress2("Street Address 2");
        address.setCity("City");
        address.setStateProvince("MA");
        address.setPostalCode("01970");

        date = new Date();
        calendar = Calendar.getInstance();
        calendar.setTime(date);

        principal.setTitle("Mr.");
        principal.setFirstName("First");
        principal.setLastName("Last");
        principal.setEmailAddress("abc@gmail.com");
        principal.setSsn("123450015");
        principal.setAddress(address);
        principal.setContactPhone("11");
        principal.setDateOfBirth(calendar);

    }

    @Test
    public void testSetCommunication(){
        payFacPrincipal.setCommunication(communication);
    }

    @Test
    public void testDeleteLegalEntityByPrincipalId(){
        PrincipalDeleteResponse response = payFacPrincipal.deleteLegalEntityByPrincipalId(2018,9);
        assertNotNull(response.getTransactionId());
        assertEquals("2018",response.getLegalEntityId());
        assertEquals(9l,(long)response.getPrincipalId());
        assertEquals("Legal Entity Principal successfully deleted",response.getResponseDescription());
    }

    @Test
    public void testPostByLegalEntityID(){
        PrincipalCreateResponse response = payFacPrincipal.postByLegalEntityID(2018,principal);
        assertNotNull(response.getTransactionId());
        assertEquals("2018",response.getLegalEntityId());
    }
}
