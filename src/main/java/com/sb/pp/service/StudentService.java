package com.sb.pp.service;

import com.sb.pp.domain.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    boolean join(StudentDTO studentDTO);
    List<StudentDTO> getList();
    boolean remove(Long idx);
    StudentDTO getOneList(Long idx);
    boolean modify(StudentDTO studentDTO);
}
