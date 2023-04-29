package com.svbabaya.openapi.controllers;

import com.svbabaya.openapi.models.PersonDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
@Api("Тестовый контроллер")
public class PersonController {

    @GetMapping("/{id}")
    @ApiOperation("Тестовый метод")
    public PersonDto getPersonById(@PathVariable int id) {
        return new PersonDto(id, "Tom");
    }

}
