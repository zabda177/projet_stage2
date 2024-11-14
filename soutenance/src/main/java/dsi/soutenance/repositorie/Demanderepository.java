package dsi.soutenance.repositorie;

import dsi.soutenance.model.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Demanderepository extends JpaRepository<Demande, Long> {
}
