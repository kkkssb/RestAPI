package com.sb.pp.service;

import com.sb.pp.domain.dto.StudentDTO;
import com.sb.pp.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public boolean join(StudentDTO studentDTO) {
        return studentMapper.insertStudent(studentDTO)==1;
    }
}
