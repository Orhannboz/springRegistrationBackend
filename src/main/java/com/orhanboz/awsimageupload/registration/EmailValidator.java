package com.orhanboz.awsimageupload.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String  emailAddress) {
       String regex = "^(.+)@(\\S+)$";
        return Pattern.compile(regex)
                .matcher(emailAddress)
                .matches();
    }


}
