package generator.service.impl;

import generator.domain.Student;
import generator.mapper.StudentMapper;
import generator.service.StudentService;
import org.springframework.stereotype.Service;

/**
* @author leniovo
* @description 针对表【student】的数据库操作Service实现
* @createDate 2024-07-24 11:02:20
*/
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}




