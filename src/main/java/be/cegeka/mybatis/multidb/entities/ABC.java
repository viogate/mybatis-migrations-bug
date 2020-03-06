package be.cegeka.mybatis.multidb.entities;

import javax.persistence.*;

@Entity
@Table(name = "ABC")
@Access(AccessType.FIELD)
public class ABC {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;

    protected ABC() {
        // for JPA
    }

    public ABC(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
