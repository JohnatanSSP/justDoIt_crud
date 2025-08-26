package jssp.java.Wallet.core.useCase;

import jssp.java.Wallet.core.entities.Negotiation;

public interface CreateNegotiationCase {

    public Negotiation execute(Negotiation negotiation);
}
