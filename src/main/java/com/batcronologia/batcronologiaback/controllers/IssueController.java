package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.issue.GetIssueDTO;
import com.batcronologia.batcronologiaback.dto.issue.IssueMapper;
import com.batcronologia.batcronologiaback.dto.issue.SaveIssueDTO;
import com.batcronologia.batcronologiaback.entities.Issue;
import com.batcronologia.batcronologiaback.services.IssueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/issues")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping
    public ResponseEntity<Page<GetIssueDTO>> findAllIssues(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(
                this.issueService.listIssue(pageable)
                        .map(IssueMapper::fromEntity)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<GetIssueDTO> findIssue(@PathVariable Long id){
        Issue issue = this.issueService.findByIssue(id);
        return ResponseEntity.ok(IssueMapper.fromEntity(issue));
    }

    @PostMapping
    public ResponseEntity<GetIssueDTO>  saveIssue(@RequestBody SaveIssueDTO dto){
        Issue issue = this.issueService.saveIssue(IssueMapper.fromDTO(dto));
        return ResponseEntity.ok(IssueMapper.fromEntity(issue));
    }

    @PutMapping("{id}")
    public ResponseEntity<GetIssueDTO> updateIssue(@RequestBody SaveIssueDTO dto, @PathVariable Long id){
        try{
            Issue issue = issueService.updateIssue(IssueMapper.fromDTO(dto), id);
            return ResponseEntity.ok(IssueMapper.fromEntity(issue));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GetIssueDTO> removeIssue(@PathVariable Long id){
        try{
            this.issueService.removeIssue(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
