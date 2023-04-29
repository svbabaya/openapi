package com.svbabaya.openapi.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@RequiredArgsConstructor
@Getter
@Setter
public class PersonDto {
    @Min(1)
    @Max(100)
    private int id;

    @NotBlank
    @Size(min = 1, max = 100)
    private String surname;

    public PersonDto(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

}
