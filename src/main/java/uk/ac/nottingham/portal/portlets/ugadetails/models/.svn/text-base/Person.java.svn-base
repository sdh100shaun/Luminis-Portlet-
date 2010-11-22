package uk.ac.nottingham.portal.portlets.ugadetails.models;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Person Class
 * Version 2.0   15.11.2010.
 *
 * Author Shaun Hare
 * Changelog.
 *
 *
 *
 */
public class Person {

    /**
     * Properties of a person in this context
     */
    public String Username;
    public String forename;
    public String surname;
    public String address_1;
    public String address_2;
    public String address_3;
    public String address_4;
    public String postcode;
    public String tel_no;
    public String email_address;
    private String applicant_type;
    private Log logger;

    public Person()
    {
      this.populate();
      logger = LogFactory.getLog(Person.class);

    }

    public String getEmail_address() {
        return email_address;
    }

    public String getUsername() {
        return Username;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress_1() {
        return address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public String getAddress_3() {
        return address_3;
    }

    public String getAddress_4() {
        return address_4;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getTel_no() {
        return tel_no;
    }

    /**
     * isDirectApplicant
     * @abstract Returns boolean depending on the applicant type
     * @return  Boolean isDirectApplicant
     */
    public boolean isDirectApplicant()
    {
        return false;
    }

    /**
     * Populate
     * @abstract populates the person object form the database
     */
    private void populate()
    {

    }
}



