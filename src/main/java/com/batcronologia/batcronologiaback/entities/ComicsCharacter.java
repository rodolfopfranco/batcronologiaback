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
public class ComicsCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String aliases;

    @ManyToMany
    @JoinTable(
            name = "comics_character_bookchrono",
            joinColumns = @JoinColumn(name = "bookchrono_id"),
            inverseJoinColumns = @JoinColumn(name = "comics_character_id"))
    private List<BookChrono> appearances;
}
