package dsi.soutenance.dto;

import dsi.soutenance.model.DemandeurMorale;
import dsi.soutenance.model.DemandeurPhysique;
import dsi.soutenance.model.PieceJointe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class SoumissionDto {
    //Propriete demandeurMorale
    private  Long id;
    private String ifu;
    private String nomResponsable;
    private String denomination;
    private String siege;
    private String mail;
    private String telephone1;
    private String telephone2;

    // Propriete demandeuurPhysique

    private String nom;
    private String prenom;
    private String genre;
    private LocalDate dateNaisse;
    private String lieuResidence;
    private String typePiece;
    private String numPiece;

    //Propriete Piecejointe

    private String libelle;
    private String url;


    public static DemandeurMoraleDto fromEntity(DemandeurMorale demandeurMorale) {
        return  DemandeurMoraleDto.builder()
                .id(demandeurMorale.getId())
                .ifu(demandeurMorale.getIfu())
                .denomination(demandeurMorale.getDenomination())
                .siege(demandeurMorale.getSiege())
                .nomResponsable(demandeurMorale.getNomResponsable())
                .mail(demandeurMorale.getMail())
                .telephone1(demandeurMorale.getTelephone1())
                .telephone2(demandeurMorale.getTelephone2())
                .build();

    }
    public static DemandeurMorale toEntity(DemandeurMoraleDto demandeurMoraleDto){
        return DemandeurMorale.builder()
                .id(demandeurMoraleDto.getId())
                .ifu(demandeurMoraleDto.ifu)
                .nomResponsable(demandeurMoraleDto.nomResponsable)
                .denomination(demandeurMoraleDto.denomination)
                .siege(demandeurMoraleDto.siege)
                .mail(demandeurMoraleDto.mail)
                .telephone1(demandeurMoraleDto.telephone1)
                .telephone2(demandeurMoraleDto.telephone2)
                .build();
    }

    public static  DemandeurPhysiqueDto fromEntity(DemandeurPhysique demandeurPhysique) {
        return DemandeurPhysiqueDto.builder()
                .id(demandeurPhysique.getId())
                .nom(demandeurPhysique.getNom())
                .prenom(demandeurPhysique.getPrenom())
                .genre(demandeurPhysique.getGenre())
                .dateNaisse(demandeurPhysique.getDateNaisse())
                .lieuResidence(demandeurPhysique.getLieuResidence())
                .telephone1(demandeurPhysique.getTelephone1())
                .telephone2(demandeurPhysique.getTelephone2())
                .mail(demandeurPhysique.getMail())
                .typePiece(demandeurPhysique.getTypePiece())
                .numPiece(demandeurPhysique.getNumPiece())
                .build();
    }
    public static DemandeurPhysique toEntity(DemandeurPhysiqueDto demandeurPhysiqueDto) {
        return DemandeurPhysique.builder()
                .id(demandeurPhysiqueDto.getId())
                .nom(demandeurPhysiqueDto.nom)
                .prenom(demandeurPhysiqueDto.prenom)
                .genre(demandeurPhysiqueDto.genre)
                .dateNaisse(demandeurPhysiqueDto.dateNaisse)
                .lieuResidence(demandeurPhysiqueDto.lieuResidence)
                .telephone1(demandeurPhysiqueDto.telephone1)
                .telephone2(demandeurPhysiqueDto.telephone2)
                .mail(demandeurPhysiqueDto.mail)
                .typePiece(demandeurPhysiqueDto.typePiece)
                .numPiece(demandeurPhysiqueDto.numPiece)
                .build();
    }


    public static PieceJointeDto fromEntity(PieceJointeDto pieceJointeDto) {
        return PieceJointeDto.builder()
                .id(pieceJointeDto.getId())
                .libelle(pieceJointeDto.getLibelle())
                .url(pieceJointeDto.getUrl())
                .build();
    }
    public  static PieceJointe toEntity(PieceJointeDto pieceJointeDto) {
        return PieceJointe.builder()
                .id(pieceJointeDto.getId())
                .libelle(pieceJointeDto.libelle)
                .url(pieceJointeDto.url)
                .build();
    }


}
