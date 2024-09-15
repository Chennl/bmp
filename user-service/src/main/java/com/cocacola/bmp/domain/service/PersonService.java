package com.cocacola.bmp.domain.service;

import com.cocacola.bmp.domain.ResultData;
import com.cocacola.bmp.domain.dto.person.PersonSearchDto;
import com.cocacola.bmp.domain.entity.PersonEntity;

import java.util.List;

public interface PersonService {
    PersonEntity getByPersonID(Long id);
    ResultData< List<PersonEntity> > search(PersonSearchDto dto);
}