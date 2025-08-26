package jssp.java.Wallet.infra.controller;
import jssp.java.Wallet.core.entities.Negotiation;
import jssp.java.Wallet.core.useCase.CreateNegotiationCase;
import jssp.java.Wallet.infra.Dtos.NegotiationDto;
import jssp.java.Wallet.infra.mapper.NegotiationDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")

public class Negotiationcontroller {

    private final CreateNegotiationCase CreateNegotiationCase;
    private final NegotiationDtoMapper NegotiationDtoMapper;

    public Negotiationcontroller(CreateNegotiationCase createNegotiationCase, NegotiationDtoMapper negotiationDtoMapper) {
        CreateNegotiationCase = createNegotiationCase;
        NegotiationDtoMapper = negotiationDtoMapper;
    }

    @PostMapping("negotiation succes")
    public NegotiationDto createNegotiation(@RequestBody NegotiationDto negotiationDto){
        Negotiation newNegotiation = CreateNegotiationCase.execute(NegotiationDtoMapper.toDomain(negotiationDto));
        return NegotiationDtoMapper.toDto(newNegotiation);
    }
}
