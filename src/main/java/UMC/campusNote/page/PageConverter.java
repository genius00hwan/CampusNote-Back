package UMC.campusNote.page;

import UMC.campusNote.note.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PageConverter {
    public static PageResponseDTO.pageResultDTO toPageResultDTO(Page page){
        return PageResponseDTO.pageResultDTO.builder()
                .pageId(page.getId())
                .noteId(page.getNote().getId())
                .build();
    }

    public static Page toPage(PageRequestDTO.PageDto request, Note note){
        return Page.builder()
                .note(note)
                .pageNumber(request.getPageNum())
                .sideNote(request.getSideNote())
                .round(request.getRound())
                .build();
    }
}