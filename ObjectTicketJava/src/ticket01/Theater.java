package ticket01;

public class Theater {
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		//관객 가방을 열어서 초대장 확인 
		if(audience.getBag().hasInvatation()) {
			 //티켓 셀러는 티켓 오퍼스에서 티켓을 하나꺼낸다
			 Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			 //관객은 초대장을 가방에 넣는다
			 audience.getBag().setTicket(ticket);
		}else {
			//티켓 셀러가 티켓 하나꺼낸다
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			//관객은 돈을 꺼낸다.
			audience.getBag().minusAmount(ticket.getFee());
			//티켓 셀러는 오퍼스에 돈을 넣는다
			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
			//관객은 티켓을 가방에 넣는다
			audience.getBag().setTicket(ticket);
		}
	}

}
