package ticket01;

public class Bag {
	private Long amount; //����
	private Invatation invatation; //�ʴ���
	private Ticket ticket; //Ƽ�� 
	
	/*
	 * �ʴ���� ���� , �ʴ���x ���ݸ� �ΰ����� 
	 */
	public Bag(long amount) {
		this(null, amount);
	}
	public Bag(Invatation invatation, long amount) {
		this.invatation = invatation;
		this.amount = amount;
	}
	public boolean hasInvatation() {
		return invatation != null;
	}
	public boolean hasTicket() {
		return ticket != null;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	public void plusAmount(long amount) {
		this.amount += amount;
	}
}
