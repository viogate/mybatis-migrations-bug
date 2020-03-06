package be.cegeka.mybatis.multidb.jpa;

import be.cegeka.mybatis.multidb.entities.ABC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbcRepository extends JpaRepository<ABC, Integer> {
}
