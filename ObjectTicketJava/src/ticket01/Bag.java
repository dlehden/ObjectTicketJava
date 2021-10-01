package ticket01;

public class Bag {
	private Long amount; //현금
	private Invatation invatation; //초대장
	private Ticket ticket; //티켓 
	
	/*
	 * 초대장과 현금 , 초대장x 현금만 두개상태 
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
