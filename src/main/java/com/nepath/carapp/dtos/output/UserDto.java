package com.nepath.carapp.dtos.output;

import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String nick;
    private String email;
}