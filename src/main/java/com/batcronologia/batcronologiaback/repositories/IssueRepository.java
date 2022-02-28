package com.batcronologia.batcronologiaback.repositories;

import com.batcronologia.batcronologiaback.entities.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository {
    Page<Issue> findAll(Pageable pageable);
}
