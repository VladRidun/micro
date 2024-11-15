package ru.services.curriculumvitaeservice.dto;

public record CurriculumVitaeRequestDto(String id,
                                        String name,
                                        String surname,
                                        String country_id,
                                        String city) {
}