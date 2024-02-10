package com.shopping.app.validation.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginForm {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
