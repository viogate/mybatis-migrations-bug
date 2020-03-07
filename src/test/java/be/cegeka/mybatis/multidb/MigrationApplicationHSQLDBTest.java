package be.cegeka.mybatis.multidb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MultiDbMigrationApplication.class})
@ActiveProfiles("janvr-met-hsqldb")
public class MigrationApplicationHSQLDBTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testMigrationsDidRun() {
        final JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        assertTrue(jdbc.queryForObject("select count(*) from changelog", Integer.class) >= 3);

    }

}
