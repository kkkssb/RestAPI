package com.sb.pp.mapper;

import com.sb.pp.domain.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int insertStudent(StudentDTO studentDTO);
    List<StudentDTO> getAll();
}
