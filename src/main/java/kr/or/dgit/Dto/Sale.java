package kr.or.dgit.Dto;

public class Sale {
	private int no;
	private char code;
	private int price;
	private int saleCnt;
	private int marginRate;
	
	
	private Sale() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public char getCode() {
		return code;
	}
	public void setCode(char code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSaleCnt() {
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}
	public int getMarginRate() {
		return marginRate;
	}
	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}
	@Override
	public String toString() {
		return String.format("Sale [no=%s, code=%s, price=%s, saleCnt=%s, marginRate=%s]", no, code, price, saleCnt,
				marginRate);
	}
	
	

}
