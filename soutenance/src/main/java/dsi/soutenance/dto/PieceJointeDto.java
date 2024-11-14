package dsi.soutenance.dto;

import dsi.soutenance.model.PieceJointe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PieceJointeDto {
    private long id;
    private String libelle;
    private String url;


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
