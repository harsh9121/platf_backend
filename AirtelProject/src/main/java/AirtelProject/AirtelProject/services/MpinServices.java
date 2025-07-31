package AirtelProject.AirtelProject.services;

import AirtelProject.AirtelProject.model.MpinEntry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MpinService {

    private final MpinRepo repository;

    public List<MpinEntry> getAllEntries() {
        return repository.findAll();
    }

    public Optional<MpinEntry> getEntryByServiceId(String serviceId) {
        return repository.findByServiceId(serviceId);
    }
}



