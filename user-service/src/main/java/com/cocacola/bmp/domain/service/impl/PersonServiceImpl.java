package com.cocacola.bmp.domain.service.impl;

import com.cocacola.bmp.domain.ResultData;
import com.cocacola.bmp.domain.dto.person.PersonSearchDto;
import com.cocacola.bmp.domain.entity.PersonEntity;
import com.cocacola.bmp.domain.mapper.PersonMapper;
import com.cocacola.bmp.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public PersonEntity getByPersonID(Long id) {
        return personMapper.selectById(id);
    }

    @Override
    public ResultData<List<PersonEntity>> search(PersonSearchDto dto) {
        return null;
    }

}
