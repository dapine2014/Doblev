package servicio.ticket.aplication.ports.inbound;

import servicio.ticket.domain.entities.Ticket;

public interface ITicketDelete {
    void deleteTicket(Ticket ticket);
}
