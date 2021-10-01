package ticket03;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
	
	//seller �� ����Ḧ üũ �ϵ��� ����
	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(
				audience.buy(ticketOffice.getTicket()));
	}

}
