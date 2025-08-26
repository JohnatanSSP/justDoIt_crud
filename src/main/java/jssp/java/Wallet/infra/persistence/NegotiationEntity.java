package jssp.java.Wallet.infra.persistence;

import jakarta.persistence.*;
import jssp.java.Wallet.core.enums.NegotiationStatus;
import jssp.java.Wallet.core.enums.NegotiationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;


@Entity
@Table(name = "Negotiation")
@NoArgsConstructor
@AllArgsConstructor
@Data


public class NegotiationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private Instant timestamp;
    private String name;
    private BigDecimal amount;
    private NegotiationType type;
    private NegotiationStatus status;
}
