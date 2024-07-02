package com.company.softwaremarket.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username;

    private String password;

    private String typeDocument;

    private String numberDocument;

    private String nameUser;

    private String firstLastName;

    private String secondLastName;

    private String phone;

    private String email;


}
