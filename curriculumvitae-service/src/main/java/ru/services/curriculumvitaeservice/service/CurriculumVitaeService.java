package ru.services.curriculumvitaeservice.service;

import ru.services.curriculumvitaeservice.dto.CurriculumVitaeRequestDto;
import ru.services.curriculumvitaeservice.dto.CurriculumVitaeResponseDto;

public interface CurriculumVitaeService {
    CurriculumVitaeResponseDto getCvOfUser(String id);
    CurriculumVitaeResponseDto save(CurriculumVitaeRequestDto curriculumVitaeDto);
}