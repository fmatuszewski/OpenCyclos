package nl.strohalm.cyclos.entities.accounts.transactions;

import nl.strohalm.cyclos.entities.converters.StringValuedEnumAttributeConverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TicketStatusAttributeConverter extends StringValuedEnumAttributeConverter<Ticket.Status> implements AttributeConverter<Ticket.Status, String> {
}
