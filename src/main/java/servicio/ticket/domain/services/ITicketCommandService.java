package servicio.ticket.domain.services;

import servicio.ticket.aplication.dto.TicketDto;

import java.util.Optional;

public interface ITicketCommandService {
    TicketDto createTicket(TicketDto ticketDto);
    Optional<TicketDto> updateTicket(TicketDto ticketDto);
    void deleteTicketById(Long id);
}
