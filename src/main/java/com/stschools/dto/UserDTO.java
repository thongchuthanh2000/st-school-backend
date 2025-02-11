package com.stschools.dto;

import com.stschools.common.enums.Role;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    @Email(message = "needs to be an email")
    @NotBlank(message = "email is required")
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private boolean active;
    private String activationCode;
    private String passwordResetCode;
    private String about;
    private Set<Role> roles;
}
