package com.orhanboz.awsimageupload.registration;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class RegistrationRequest {
    private final String firstname;
    private final String lastName;
    private final String email;
    private final String password;

}
