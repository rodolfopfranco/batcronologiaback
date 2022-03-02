package com.batcronologia.batcronologiaback.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookBr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String editora;
    private Date data;
    private String urlCover;

    @ManyToMany
    @JoinTable(
            name = "bookbr_issues",
            joinColumns = @JoinColumn(name = "bookbr_id"),
            inverseJoinColumns = @JoinColumn(name = "issue_id"))
    private List<Issue> issues;

    public BookBr(Long id) {
        this.id = id;
    }
}
