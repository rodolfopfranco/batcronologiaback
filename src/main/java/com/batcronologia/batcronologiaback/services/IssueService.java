package com.batcronologia.batcronologiaback.services;

import com.batcronologia.batcronologiaback.entities.Issue;
import com.batcronologia.batcronologiaback.repositories.IssueRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class IssueService {
    private final IssueRepository issueRepository;

    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public Issue saveIssue(Issue issue){
        return this.issueRepository.save(issue);
    }

    public Page<Issue> listIssue(Pageable pageable){
        return this.issueRepository.findAll(pageable);
    }

    public Page<Issue> listIssueByVolume(Pageable pageable, Long idVolume){
        return this.issueRepository.findByVolume_Id(idVolume, pageable);
    }

    public Issue findByIssue(Long id){
        Optional<Issue> issueOptional = this.issueRepository.findById(id);
        return issueOptional.orElseThrow(() -> new EntityNotFoundException("Issue not found"));
    }

    public Issue updateIssue(Issue issue, Long id){
        Issue issueFound = this.findByIssue(id);
        issue.setId(id);
        return this.issueRepository.save(issue);
    }

    public void removeIssue(Long id){
        Issue issueFound = this.findByIssue(id);
        this.issueRepository.delete(issueFound);
    }
}
