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
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long number;
    private String urlCover;

    @ManyToOne
    @JoinColumn(name = "volume_id")
    private Volume volume;

    @ManyToMany(mappedBy = "issues")
    private List<Artist> artists;

    @ManyToMany(mappedBy = "issues")
    private List<BookBr> booksBR;
}
