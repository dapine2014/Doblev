package servicio.ticket.aplication.services;

import org.springframework.stereotype.Service;
import servicio.ticket.aplication.dto.TicketDto;
import servicio.ticket.domain.services.ITicketCommandService;

import java.util.Optional;

@Service
public class TicketCommandServiceImpl implements ITicketCommandService {

    @Override
    public TicketDto createTicket(TicketDto ticketDto) {
        return null;
    }

    @Override
    public Optional<TicketDto> updateTicket(TicketDto ticketDto) {
        return Optional.empty();
    }

    @Override
    public void deleteTicketById(Long id) {

    }
}
