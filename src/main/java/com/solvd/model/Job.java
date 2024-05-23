package com.solvd.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Job {
    private String title;
    private String description;
}
