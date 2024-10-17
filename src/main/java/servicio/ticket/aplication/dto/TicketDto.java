package servicio.ticket.aplication.dto;

import lombok.Value;
import servicio.ticket.domain.auxiliary.Estatus;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link servicio.ticket.domain.entities.Ticket}
 */
@Value
public class TicketDto implements Serializable {
    Long id;
    String usuario;
    LocalDateTime fechaCreacion;
    LocalDateTime fechaActualizacion;
    Estatus estatus;
}