package servicio.ticket.aplication.usecases;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import servicio.ticket.aplication.dto.TicketDto;
import servicio.ticket.domain.services.ITicketCommandService;

@ExtendWith(MockitoExtension.class)
class TicketCreateUseCaseTest {

    @Mock
    ITicketCommandService ticketCommandServiceMock;

    @InjectMocks
    TicketCreateUseCase ticketCreateUseCase;

    @Test
    void ticketCreate() {
        TicketDto ticketDto = new TicketDto(/*...*/);
        when(ticketCommandServiceMock.createTicket(ticketDto)).thenReturn(ticketDto);

        // Act
        TicketDto returnedTicket = ticketCreateUseCase.TicketCreate(ticketDto);

        // Assert
        assertEquals(ticketDto, returnedTicket);
        verify(ticketCommandServiceMock).createTicket(ticketDto);
    }
}