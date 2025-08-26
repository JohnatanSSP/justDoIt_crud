package jssp.java.Wallet.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NegotiationRepository extends JpaRepository<NegotiationEntity ,Long> {
}
