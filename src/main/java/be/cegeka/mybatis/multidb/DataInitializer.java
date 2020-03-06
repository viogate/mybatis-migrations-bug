package be.cegeka.mybatis.multidb;

import be.cegeka.mybatis.multidb.entities.ABC;
import be.cegeka.mybatis.multidb.jpa.AbcRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    @Autowired
    private AbcRepository repository;

    @Scheduled(initialDelay = 100L, fixedDelay = 5000L)
    public void saveData() {

        repository.save(new ABC(RandomStringUtils.randomAscii(10)));
        repository.flush();

        final List<ABC> all = repository.findAll();
        System.out.println(all.size() + " ABC items");
    }
}
