package com.batcronologia.batcronologiaback.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;

    @ManyToMany
    @JoinTable(
            name = "artists_issues",
            joinColumns = @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "issue_id"))
    private List<Issue> issues;

    public Artist(Long id) {
        this.id = id;
    }
}
