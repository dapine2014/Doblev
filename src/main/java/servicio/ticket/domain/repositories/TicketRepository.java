package servicio.ticket.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import servicio.ticket.domain.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}