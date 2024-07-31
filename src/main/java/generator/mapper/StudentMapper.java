package generator.mapper;

import generator.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
* @author leniovo
* @description 针对表【student】的数据库操作Mapper
* @createDate 2024-07-24 11:02:20
* @Entity generator.domain.Student
*/
@Mapper
@Service
public interface StudentMapper {
    Student selectByPrimaryKey(Integer id);
}




