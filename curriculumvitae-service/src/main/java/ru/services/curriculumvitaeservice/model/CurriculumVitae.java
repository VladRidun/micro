package ru.services.curriculumvitaeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CurriculumVitae {
    private String id;
    private String name;
    private String surname;
    private String country_id;
    private String city;
}