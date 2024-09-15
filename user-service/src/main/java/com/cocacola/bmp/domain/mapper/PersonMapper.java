package com.cocacola.bmp.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cocacola.bmp.domain.entity.PersonEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper extends BaseMapper<PersonEntity> {

}
