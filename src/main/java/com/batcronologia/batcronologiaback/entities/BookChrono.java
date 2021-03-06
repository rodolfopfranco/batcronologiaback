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
public class BookChrono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderNumber;
    private Date datePublish;
    private String name;
    private String description;
    private String urlCover;

    @ManyToMany
    @JoinTable(
            name = "bookchrono_issues",
            joinColumns = @JoinColumn(name = "bookchrono_id"),
            inverseJoinColumns = @JoinColumn(name = "issue_id"))
    private List<Issue> issues;

    public BookChrono(Long id) {
        this.id = id;
    }
}
