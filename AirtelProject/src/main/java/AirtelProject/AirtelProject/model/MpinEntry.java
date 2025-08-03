package AirtelProject.AirtelProject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "mpin_entries")
public class MpinEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;
    private String teamDl;
    private String applicationName;
    private String serviceId;
    private String description;
    private String averageTraffic;
    private String peakTraffic;
    private String peakTrafficHrs;
}
