package com.ahmed.pfa.cvplatform.matching;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * DTO pour requête de matching
 * Envoyé par l'admin quand il crée une offre privée
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchingRequestDTO {

    /**
     * Compétences requises pour l'offre
     * Exemple: ["Java", "Spring Boot", "MySQL", "Git"]
     */
    @NotNull(message = "Les compétences requises ne peuvent pas être nulles")
    @NotEmpty(message = "Au moins une compétence est requise")
    private List<String> competencesRequises;

    /**
     * Domaine de l'offre (optionnel mais recommandé)
     * Exemple: "Informatique", "Développement Web", "Data Science"
     */
    private String domaine;

    /**
     * Titre de l'offre (pour logging/debug)
     */
    private String titreOffre;
}