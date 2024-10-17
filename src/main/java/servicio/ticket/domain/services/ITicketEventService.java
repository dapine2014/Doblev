package servicio.ticket.domain.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import servicio.ticket.aplication.dto.TicketDto;

import java.util.Optional;

public interface ITicketEventService {
   Page<TicketDto> getAllTickets(Pageable pageable);
   Optional<TicketDto> findTicketById(Long id);
}
