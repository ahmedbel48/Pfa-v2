package com.ahmed.pfa.cvplatform.matching;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO représentant un étudiant suggéré pour une offre
 * Contient toutes les infos nécessaires pour que l'admin décide
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantSuggestionDTO {

    // ═══════════════════════════════════════════════════
    // INFORMATIONS ÉTUDIANT
    // ═══════════════════════════════════════════════════

    /**
     * ID de l'étudiant
     */
    private Long etudiantId;

    /**
     * Nom complet
     */
    private String nom;

    private String prenom;

    /**
     * Email
     */
    private String email;

    /**
     * Université
     */
    private String universite;

    /**
     * Domaine d'étude
     */
    private String domaineEtude;

    /**
     * Niveau d'étude (Licence, Master, Doctorat)
     */
    private String niveauEtude;

    // ═══════════════════════════════════════════════════
    // STATISTIQUES ÉTUDIANT
    // ═══════════════════════════════════════════════════

    /**
     * Nombre de CVs uploadés
     */
    private int nombreCVs;

    /**
     * Nombre d'analyses réalisées
     */
    private int nombreAnalyses;

    /**
     * Score moyen de toutes ses analyses (0-100)
     */
    private Double scoreMoyenAnalyses;

    /**
     * Meilleur score obtenu dans ses analyses
     */
    private Double meilleurScore;

    // ═══════════════════════════════════════════════════
    // MATCHING POUR CETTE OFFRE
    // ═══════════════════════════════════════════════════

    /**
     * Détails du scoring pour cette offre
     */
    private ScoreDetailsDTO scoreDetails;

    /**
     * Compétences de l'étudiant qui matchent avec l'offre
     * Exemple: ["Java", "Spring Boot", "MySQL"]
     */
    private List<String> competencesMatchees;

    /**
     * Nombre de compétences matchées
     */
    private int nombreCompetencesMatchees;

    /**
     * Compétences requises mais manquantes chez l'étudiant
     * Exemple: ["Docker", "Kubernetes"]
     */
    private List<String> competencesManquantes;

    /**
     * Rang de cette suggestion (1 = meilleur, 2 = second, etc.)
     */
    private int rang;

    /**
     * Raison principale de la suggestion
     * Exemple: "Excellent score compétences (45/50) et historique solide"
     */
    private String raisonSuggestion;
}