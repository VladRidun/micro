package ru.services.curriculumvitaeservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.services.curriculumvitaeservice.dto.CurriculumVitaeRequestDto;
import ru.services.curriculumvitaeservice.dto.CurriculumVitaeResponseDto;
import ru.services.curriculumvitaeservice.mapper.CurriculumVitaeMapper;
import ru.services.curriculumvitaeservice.model.CurriculumVitae;
import ru.services.curriculumvitaeservice.repository.CurriculumVitaeRepository;

@Service
@AllArgsConstructor
public class CurriculumVitaeServiceImpl implements CurriculumVitaeService {

    private final CurriculumVitaeRepository curriculumVitaeRepository;
    private final CurriculumVitaeMapper curriculumVitaeMapper;

    @Override
    public CurriculumVitaeResponseDto getCvOfUser(String id) {
        return curriculumVitaeMapper.getDtoFromEntity(curriculumVitaeRepository.getCvOfUser(id));
    }

    @Override
    public CurriculumVitaeResponseDto save(CurriculumVitaeRequestDto curriculumVitaeDto) {
        String id = curriculumVitaeDto.id();
        CurriculumVitae curriculumVitae = curriculumVitaeMapper.getEntityFromDto(curriculumVitaeDto);
        return curriculumVitaeMapper.getDtoFromEntity(curriculumVitaeRepository.save(id, curriculumVitae));
    }
}