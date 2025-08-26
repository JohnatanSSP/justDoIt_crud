package jssp.java.Wallet.core.entities;
import jssp.java.Wallet.core.enums.NegotiationStatus;
import jssp.java.Wallet.core.enums.NegotiationType;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record Negotiation(UUID id,
                          Instant timestamp,
                          String name,
                          BigDecimal amount,
                          NegotiationType type,
                          NegotiationStatus status) {
}
