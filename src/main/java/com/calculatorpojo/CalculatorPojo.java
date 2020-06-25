package com.calculatorpojo;

public class CalculatorPojo {

	private String n1 = "";
	private String n2 = "";

	private int no1 = -1;
	private int no2 = -1;
	private int ans = 0;
	private int operand = -1;

	public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = this.n1 + n1;
	}

	public String getN2() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = this.n2 + n2;
	}

	public void clear() {
		this.n1 = "";
		this.n2 = "";
		this.operand=-1;
		this.ans=0;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

}
