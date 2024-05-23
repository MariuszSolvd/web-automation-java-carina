package com.solvd.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String idEmployee;
}
