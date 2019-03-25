package com.example.projectx.Domain;



import javax.persistence.*;

@Entity
public class DocxContext {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocxContext(String name) {
        this.name = name;
    }

    public DocxContext() {

    }
}
