package com.sb.pp.mapper;

import com.sb.pp.domain.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    int insertStudent(StudentDTO studentDTO);
}
