package ru.services.curriculumvitaeservice.repository;

import ru.services.curriculumvitaeservice.model.CurriculumVitae;

public interface CurriculumVitaeRepository {
    CurriculumVitae getCvOfUser(String code);
    CurriculumVitae save(String id, CurriculumVitae curriculumVitae);
}