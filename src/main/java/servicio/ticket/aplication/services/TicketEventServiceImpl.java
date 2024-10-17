package servicio.ticket.aplication.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import servicio.ticket.aplication.dto.TicketDto;
import servicio.ticket.domain.services.ITicketEventService;
import java.util.Optional;

@Service
public class TicketEventServiceImpl implements ITicketEventService {
    @Override
    public Page<TicketDto> getAllTickets(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<TicketDto> findTicketById(Long id) {
        return Optional.empty();
    }
}
