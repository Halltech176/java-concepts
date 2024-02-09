package com.halltech.person;

import com.halltech.utils.StringUtils;

public class PersonService {
    public int addPerson(Person person) {
        if(StringUtils.isEmpty(person.getFirstName())) {
            throw new IllegalArgumentException("First name caanot be blank");
        }
        return 1;
    }

}
