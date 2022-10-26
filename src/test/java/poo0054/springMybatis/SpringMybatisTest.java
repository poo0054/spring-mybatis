package poo0054.springMybatis;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import poo0054.ibatis.dao.TableAttributeDao;
import poo0054.ibatis.entity.TableAttribute;
import poo0054.springMybatis.config.MyBatisConfig;

import java.util.List;

/**
 * @author ZhangZhi
 * @version 1.0
 * @date 2022/10/26 17:15
 */
public class SpringMybatisTest {

  @Test
  void test() {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyBatisConfig.class);
    TableAttributeDao tableAttributeDao = annotationConfigApplicationContext.getBean("tableAttributeDao", TableAttributeDao.class);
    List<TableAttribute> tableAttributes = tableAttributeDao.queryAllByLimit(new TableAttribute());
    tableAttributes.forEach(System.out::println);
  }
}
