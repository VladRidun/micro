package ru.services.curriculumvitaeservice.repository;

import org.springframework.stereotype.Repository;
import ru.services.curriculumvitaeservice.model.CurriculumVitae;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CurriculumVitaeRepositoryImpl implements CurriculumVitaeRepository {
    private Map<String, CurriculumVitae> curriculumVitaes = new HashMap<>();

    @Override
    public CurriculumVitae getCvOfUser(String code) {
        return getCurriculumVitaeBase().get(code);
    }

    @Override
    public CurriculumVitae save(String id, CurriculumVitae curriculumVitae) {
        getCurriculumVitaeBase().put(curriculumVitae.getId(), curriculumVitae);
        return getCurriculumVitaeBase().get(curriculumVitae.getId());
    }

    private Map<String, CurriculumVitae> getCurriculumVitaeBase() {
        curriculumVitaes.put("1", new CurriculumVitae("1", "Vlad", "Vladov", "1", "Moscow"));
        curriculumVitaes.put("2", new CurriculumVitae("2", "Marina", "Marinina", "2", "Minsk"));
        curriculumVitaes.put("3", new CurriculumVitae("3", "Artem", "Artemov", "3", "Pekin"));
        return curriculumVitaes;
    }
}