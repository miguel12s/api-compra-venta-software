package com.company.softwaremarket.services;

import com.company.softwaremarket.dto.AuthResponse;
import com.company.softwaremarket.dto.LoginRequest;
import com.company.softwaremarket.dto.RegisterRequest;
import com.company.softwaremarket.jwt.JwtService;
import com.company.softwaremarket.models.entities.DetailsParameterEntity;
import com.company.softwaremarket.models.entities.RoleEntity;
import com.company.softwaremarket.models.entities.RoleEnum;
import com.company.softwaremarket.models.entities.UserEntity;
import com.company.softwaremarket.repositories.DetailParameterRepository;
import com.company.softwaremarket.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    private final JwtService jwtService;
    private final DetailParameterRepository detailParameterRepository;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;




    public AuthResponse register(RegisterRequest registerRequest) {


        DetailsParameterEntity detailsParameter=detailParameterRepository.findByDescription(registerRequest.getTypeDocument());
        RoleEntity roleEntity=RoleEntity.builder()
                .id(1L)
                .roleName(RoleEnum.USER)
                .build();


        UserEntity user=UserEntity.builder()
                .email(registerRequest.getEmail())
                .firstLastName(registerRequest.getFirstLastName())
                .nameUser(registerRequest.getNameUser())
                .numberDocument(registerRequest.getNumberDocument())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .phone(registerRequest.getPhone())
                .secondLastName(registerRequest.getSecondLastName())
                .username(registerRequest.getUsername())
                .typeDocumentIndex(detailsParameter)
                .roleEntities(Set.of(roleEntity))
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();

    }

    public AuthResponse login(LoginRequest loginRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),loginRequest.getPassword()));
        UserDetails user=userRepository.findByUsername(loginRequest.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }
}
