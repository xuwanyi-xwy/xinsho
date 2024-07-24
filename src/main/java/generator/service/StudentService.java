package generator.service;

import generator.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
* @author leniovo
* @description 针对表【student】的数据库操作Service
* @createDate 2024-07-24 11:02:20
*/

/**
 *
 */
@Component
@Service
public interface StudentService {

    Student queryStudentById(Integer id);

}
