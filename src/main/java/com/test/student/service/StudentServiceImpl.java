package com.test.student.service;

import com.test.student.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentServiceImpl implements  StudentService {

    @Override
    public List<StudentDto> getStudents() {
        List<StudentDto> sudents = Stream.of(new StudentDto(1,"Rohit","Farmington","USA"),new StudentDto(3,"Sachin","NewJersey","USA"),
                new StudentDto(2,"Virat","Dallas","USA")).collect(Collectors.toList());
        return sudents;
    }

    public List<StudentDto> getStudents(String city)
    {
        List<StudentDto> sudents = Stream.of(new StudentDto(1,"Rohit","Farmington","USA"),new StudentDto(2,"Surya","LA","USA"),
                new StudentDto(3,"Shubham","nevada","USA")).collect(Collectors.toList());
     //   List<ProductByTypeVO> productsTypeList =productsList.stream().filter(product -> product.getProductType().equals(productType)).collect(Collectors.toList());

        List<StudentDto> stdlistbyvity= sudents.stream().filter(studentDto -> studentDto.getCity().equals(city)).collect(Collectors.toList());


return stdlistbyvity;

    }
}
