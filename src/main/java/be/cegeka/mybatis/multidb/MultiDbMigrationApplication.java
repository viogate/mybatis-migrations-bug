package be.cegeka.mybatis.multidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories(basePackages = "be.cegeka.mybatis.multidb.jpa")
public class MultiDbMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDbMigrationApplication.class, args);
    }

}
