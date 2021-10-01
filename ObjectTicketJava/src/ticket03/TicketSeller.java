package ticket03;

public class TicketSeller {
	private TicketOffice ticketOffice;
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
	
	//seller 가 입장료를 체크 하도록 위임
	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(
				audience.buy(ticketOffice.getTicket()));
	}

}
