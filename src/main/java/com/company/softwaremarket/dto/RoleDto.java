package com.company.softwaremarket.dto;

import com.company.softwaremarket.models.entities.RoleEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Optional;

@Data
@Builder
@ToString
public class RoleDto {
    private String messageError;

}
