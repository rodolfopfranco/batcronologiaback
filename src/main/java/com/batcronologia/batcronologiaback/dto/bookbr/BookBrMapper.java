package com.batcronologia.batcronologiaback.dto.bookbr;

import com.batcronologia.batcronologiaback.dto.issue.IssueMapper;
import com.batcronologia.batcronologiaback.entities.BookBr;

public class BookBrMapper {

    public static BookBr fromDTO(SaveBookBrDTO dto){
        return new BookBr(
                null,
                dto.getNome(),
                dto.getEditora(),
                dto.getData(),
                dto.getUrlCover(),
                IssueMapper.fromLongListToEntityList(dto.getIssueIds())
        );
    }

    public static GetBookBrDTO fromEntity(BookBr bookBr){
        return new GetBookBrDTO(
                bookBr.getId(),
                bookBr.getNome(),
                bookBr.getEditora(),
                bookBr.getData(),
                bookBr.getUrlCover(),
                IssueMapper.fromEntityListToLvl1DtoList(bookBr.getIssues())
        );
    }
}
