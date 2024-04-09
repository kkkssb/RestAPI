package com.sb.pp.service;

import com.sb.pp.domain.dto.StudentDTO;
import com.sb.pp.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public boolean join(StudentDTO studentDTO) {

        return studentMapper.insertStudent(studentDTO)==1;
    }

    @Override
    public List<StudentDTO> getList() {
        return studentMapper.getAll();
    }

    @Override
    public boolean remove(Long idx) {
        return studentMapper.removeStudent(idx)==1;
    }

    @Override
    public StudentDTO getOneList(Long idx) {
        return studentMapper.getOne(idx);
    }

    @Override
    public boolean modify(StudentDTO studentDTO) {
        return studentMapper.updateStudent(studentDTO)==1;
    }
}
