package com.example.backendupdated.registration;

import com.example.backendupdated.entities.AppUserRole;
import com.example.backendupdated.services.AppUserService;
import com.example.backendupdated.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        String token = appUserService.signUpUser(
                new User(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )

        );


        return token;
    }

}
