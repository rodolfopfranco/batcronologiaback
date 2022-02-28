package com.batcronologia.batcronologiaback.repositories;

import com.batcronologia.batcronologiaback.entities.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    Page<Artist> findAll(Pageable pageable);
    Page<Artist> findByIssue_Id(Long IssueId, Pageable pageable);
}
