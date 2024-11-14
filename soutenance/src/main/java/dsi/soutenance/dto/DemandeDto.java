package dsi.soutenance.dto;

import dsi.soutenance.model.Demande;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class DemandeDto {
    private long id;
    private String categorie;
    private String typeDemande;
    private String statut;
    private Long prix;
    private LocalDate dateDepot;
    private LocalDate dateValidation;

    public  static  DemandeDto fromEntity(Demande demande) {
        return DemandeDto.builder()
                .id(demande.getId())
                .categorie(demande.getCategorie())
                .typeDemande(demande.getTypeDemande())
                .statut(demande.getStatut())
                .prix(demande.getPrix())
                .dateDepot(demande.getDateDepot())
                .dateValidation(demande.getDateValidation())
                .build();
    }

    public static Demande toEntity(DemandeDto demandeDto) {
        return   Demande.builder()
                .id((demandeDto.getId()))
                .categorie(demandeDto.categorie)
                .typeDemande((demandeDto.typeDemande))
                .statut(demandeDto.statut)
                .prix(demandeDto.prix)
                .dateDepot(demandeDto.dateDepot)
                .dateValidation((demandeDto.dateValidation))
                .build();
    }


}
