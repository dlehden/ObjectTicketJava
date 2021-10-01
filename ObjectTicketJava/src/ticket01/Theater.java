package ticket01;

public class Theater {
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		//���� ������ ��� �ʴ��� Ȯ�� 
		if(audience.getBag().hasInvatation()) {
			 //Ƽ�� ������ Ƽ�� ���۽����� Ƽ���� �ϳ�������
			 Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			 //������ �ʴ����� ���濡 �ִ´�
			 audience.getBag().setTicket(ticket);
		}else {
			//Ƽ�� ������ Ƽ�� �ϳ�������
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			//������ ���� ������.
			audience.getBag().minusAmount(ticket.getFee());
			//Ƽ�� ������ ���۽��� ���� �ִ´�
			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
			//������ Ƽ���� ���濡 �ִ´�
			audience.getBag().setTicket(ticket);
		}
	}

}
