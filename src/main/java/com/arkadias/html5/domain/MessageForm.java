package com.arkadias.html5.domain;

import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class MessageForm {

    @Size(min = 2)
    private String name;

    @Size(min = 7, max = 64)
    private String email;

    @Size(min = 10, max = 17)
    private String phone;

    private String website;

    @Size(min = 1)
    private String message;
}
