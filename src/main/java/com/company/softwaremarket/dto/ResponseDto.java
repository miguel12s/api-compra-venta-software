package com.company.softwaremarket.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Optional;

@Data
@Builder
@ToString

public class ResponseDto {
    private String message;
    private Integer code;


}
