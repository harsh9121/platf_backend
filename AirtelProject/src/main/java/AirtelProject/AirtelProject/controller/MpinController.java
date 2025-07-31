

package AirtelProject.AirtelProject.controller;

import AirtelProject.AirtelProject.model.MpinEntry;
import AirtelProject.AirtelProject.service.MpinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:55060")

@RequestMapping("/api/mpin")

@RestController
@RequestMapping("/api/mpin")
// Allow Angular to access backend
@RequiredArgsConstructor
public class MpinController {

    private final MpinService service;

    @GetMapping("/loadAll")
    public ResponseEntity<List<MpinEntry>> loadAllEntries() {
        return ResponseEntity.ok(service.getAllEntries());
    }

    @GetMapping("/search/{serviceId}")
    public ResponseEntity<MpinEntry> searchByServiceId(@PathVariable String serviceId) {
        return service.getEntryByServiceId(serviceId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
