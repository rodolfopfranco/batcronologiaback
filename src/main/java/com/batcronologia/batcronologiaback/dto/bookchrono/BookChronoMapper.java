package com.batcronologia.batcronologiaback.dto.bookchrono;

import com.batcronologia.batcronologiaback.dto.issue.IssueMapper;
import com.batcronologia.batcronologiaback.entities.BookChrono;

import java.util.ArrayList;
import java.util.List;

public class BookChronoMapper {

    public static BookChrono fromDTO(SaveBookChronoDTO dto){
        return new BookChrono(
                null,
                dto.getOrderNumber(),
                dto.getDatePublish(),
                dto.getName(),
                dto.getDescription(),
                dto.getUrlCover(),
                IssueMapper.fromLongListToEntityList(dto.getIssuesIds())
        );
    }

    public static GetBookChronoDTO fromEntity(BookChrono bookChrono){
        return new GetBookChronoDTO(
                bookChrono.getId(),
                bookChrono.getOrderNumber(),
                bookChrono.getDatePublish(),
                bookChrono.getName(),
                bookChrono.getDescription(),
                bookChrono.getUrlCover(),
                IssueMapper.fromEntityListToLvl1DtoList(bookChrono.getIssues())
        );
    }

    public static GetLvl1BookChronoDTO fromEntityToLvl1DTO(BookChrono bookChrono){
        return new GetLvl1BookChronoDTO(
                bookChrono.getId(),
                bookChrono.getOrderNumber(),
                bookChrono.getDatePublish(),
                bookChrono.getName(),
                bookChrono.getDescription(),
                bookChrono.getUrlCover()
        );
    }

    public static List<BookChrono> fromLongListToEntityList(List<Long> ids){
        List<BookChrono> bookChronos = new ArrayList<>();
        for (Long id: ids){
            bookChronos.add(new BookChrono(id));
        }
        return bookChronos;
    }

    public static List<GetLvl1BookChronoDTO> fromEntityListToLvl1DTOList(List<BookChrono> bookChronos){
        List<GetLvl1BookChronoDTO> lvl1BookChronoDTOS = new ArrayList<>();
        for (BookChrono bookChrono : bookChronos){
            lvl1BookChronoDTOS.add(BookChronoMapper.fromEntityToLvl1DTO(bookChrono));
        }
        return lvl1BookChronoDTOS;
    }
}
