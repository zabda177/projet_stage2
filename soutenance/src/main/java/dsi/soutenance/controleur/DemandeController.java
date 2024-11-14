package dsi.soutenance.controleur;

import dsi.soutenance.dto.DemandeDto;
import dsi.soutenance.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pieceJointe")
@CrossOrigin("*")
public class DemandeController {


    @Autowired
    private DemandeService demandeService;

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody DemandeDto demandeDto) {
        return ResponseEntity.ok(demandeService.save(demandeDto));
    }

    @PostMapping("/multiple")
    public ResponseEntity<?> createMultiple(@RequestBody List<DemandeDto> demandes) {
        demandeService.saveAll(demandes);
        return ResponseEntity.ok("OK");
    }

    @PutMapping
    public ResponseEntity<Long> update(@RequestBody DemandeDto demandeDto) {
        return ResponseEntity.ok(demandeService.save(demandeDto));
    }

    @GetMapping
    public ResponseEntity<List<DemandeDto>> getAll() {
        return ResponseEntity.ok(demandeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.ok(demandeService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        demandeService.deleteById(id);
        return ResponseEntity.ok("Demande Supprimer");
    }

    @DeleteMapping("/multiple")
    public ResponseEntity<String> deleteAll(@RequestBody List<DemandeDto> demandes) {
        demandeService.deleteAll(demandes);
        return ResponseEntity.ok("Liste de demande supprimer");
    }
}
