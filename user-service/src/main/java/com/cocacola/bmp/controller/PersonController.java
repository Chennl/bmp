package com.cocacola.bmp.controller;

import com.cocacola.bmp.domain.ResultData;
import com.cocacola.bmp.domain.dto.person.PersonSearchDto;
import com.cocacola.bmp.domain.entity.PersonEntity;
import com.cocacola.bmp.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/search")
    public ResultData<List<PersonEntity>> search(@RequestBody PersonSearchDto dto) {
        return personService.search(dto);
    }
    @RequestMapping("/id/{id}")
    public ResultData getPerson(@PathVariable(value = "id") Long id) {
        PersonEntity person = personService.getByPersonID(id);
       return  ResultData.SUCCESS(person);
    }
    @RequestMapping("/add")
    public ResultData addPerson(@RequestBody PersonEntity person) {
        //personService(person);
        return ResultData.SUCCESS(person);
    }

}
