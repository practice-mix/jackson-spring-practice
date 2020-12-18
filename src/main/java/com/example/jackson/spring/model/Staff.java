package com.example.jackson.spring.model;

import java.io.Serializable;
import lombok.Data;
import java.util.Date;
import java.util.List;

/**
*  staff
* @author  2020-12-18
*/
@Data
public class Staff {

    /**
    * first_name
    */
    private String firstName;

    /**
    * last_name
    */
    private String lastName;

    /**
    * address_id
    */
    private Integer addressId;

    /**
    * picture
    */
    private String picture;

    /**
    * email
    */
    private String email;

    /**
    * store_id
    */
    private Integer storeId;

    /**
    * active
    */
    private Integer active;

    /**
    * username
    */
    private String username;

    /**
    * password
    */
    private String password;

    /**
    * last_update
    */
    private Date lastUpdate;

    public Staff() {
    }

}
