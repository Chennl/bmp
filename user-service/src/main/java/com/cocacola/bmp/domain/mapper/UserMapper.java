package com.cocacola.bmp.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cocacola.bmp.domain.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
