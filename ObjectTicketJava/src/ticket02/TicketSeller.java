package ticket02;

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
		//���� ������ ��� �ʴ��� Ȯ�� 
		if(audience.getBag().hasInvatation()) {
			 //Ƽ�� ������ Ƽ�� ���۽����� Ƽ���� �ϳ�������
			 Ticket ticket = ticketOffice.getTicket();
			 //������ �ʴ����� ���濡 �ִ´�
			 audience.getBag().setTicket(ticket);
		}else {
			//Ƽ�� ������ Ƽ�� �ϳ�������
			Ticket ticket = ticketOffice.getTicket();
			//������ ���� ������.
			audience.getBag().minusAmount(ticket.getFee());
			//Ƽ�� ������ ���۽��� ���� �ִ´�
			ticketOffice.plusAmount(ticket.getFee());
			//������ Ƽ���� ���濡 �ִ´�
			audience.getBag().setTicket(ticket);
		}
	}

}
