package jssp.java.Wallet.infra.mapper;

import jssp.java.Wallet.core.entities.Negotiation;
import jssp.java.Wallet.infra.Dtos.NegotiationDto;
import org.springframework.stereotype.Component;

@Component
public class NegotiationDtoMapper {

    public NegotiationDto toDto(Negotiation negotiation){
        return new NegotiationDto(
                negotiation.id(),
                negotiation.timestamp(),
                negotiation.name(),
                negotiation.amount(),
                negotiation.type(),
                negotiation.status()
        );
    }

    public Negotiation toDomain(NegotiationDto negotiationDto){
        return new Negotiation(
            negotiationDto.id(),
            negotiationDto.timestamp(),
            negotiationDto.name(),
            negotiationDto.amount(),
            negotiationDto.type(),
            negotiationDto.status()
        );
    }
}
