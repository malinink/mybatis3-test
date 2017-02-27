package easytests.mappers;

import easytests.config.DatabaseConfig;
import easytests.entities.Student;
import easytests.entities.StudentInterface;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author malinink
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = {"classpath:database.test.properties"})
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {DatabaseConfig.class})
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/mappersTestData.sql")
public class StudentsMapperTest {
    @Autowired
    private StudentsMapper studentsMapper;

    @Test
    public void testFind() throws Exception {
        final StudentInterface student = this.studentsMapper.find(1);

        Assert.assertEquals((long) 1, (long) student.getId());
        Assert.assertEquals("Name1", student.getName());
    }

}
