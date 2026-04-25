package com.ahmed.pfa.cvplatform.matching;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Détails du scoring par critère
 * Permet de comprendre pourquoi un étudiant a ce score
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDetailsDTO {

    /**
     * Score compétences (0-50 points)
     * Basé sur nombre de compétences matchées
     */
    private int scoreCompetences;

    /**
     * Score domaine d'étude (0-20 points)
     * Basé sur correspondance domaine
     */
    private int scoreDomaine;

    /**
     * Score historique analyses (0-30 points)
     * Basé sur score moyen des analyses passées
     */
    private int scoreHistorique;

    /**
     * Score total (0-100 points)
     * Somme des 3 scores ci-dessus
     */
    private int scoreTotal;

    /**
     * Explication textuelle du score
     * Exemple: "7 compétences matchées, domaine compatible, score moyen analyses: 82%"
     */
    private String explication;
}