package com.ahmed.pfa.cvplatform.matching;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO de réponse globale du matching
 * Contient la liste complète des suggestions
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchingResponseDTO {

    /**
     * Liste des étudiants suggérés (Top 10)
     * Triés par score décroissant
     */
    private List<EtudiantSuggestionDTO> suggestions;

    /**
     * Nombre total d'étudiants analysés
     */
    private int nombreEtudiantsAnalyses;

    /**
     * Nombre de suggestions retournées (max 10)
     */
    private int nombreSuggestions;

    /**
     * Timestamp de la génération
     */
    private LocalDateTime dateGeneration;

    /**
     * Durée du calcul en millisecondes
     */
    private long dureeCalculMs;

    /**
     * Critères utilisés pour le matching
     */
    private MatchingRequestDTO criteresUtilises;

    /**
     * Message de résumé
     * Exemple: "10 étudiants suggérés sur 45 analysés en 234ms"
     */
    private String message;
}