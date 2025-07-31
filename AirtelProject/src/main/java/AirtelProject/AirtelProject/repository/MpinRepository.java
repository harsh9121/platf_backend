package AirtelProject.AirtelProject.repository;

import AirtelProject.AirtelProject.model.MpinEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<mpin_entries, Long> {
    Optional<mpin_entries> findByServiceId(String serviceId);
}

