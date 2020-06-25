package com.calculatorService;

import com.calculatorpojo.CalculatorPojo;

public class Service {
	CalculatorPojo pojo = new CalculatorPojo();
	private int no1, no2;

	public int addition(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int operation(int no1,int no2 , int operand) {
//		int operand=pojo.getOperand();
		int ans = 0;
//		no1 = pojo.getNo1();
//		no2 = pojo.getNo2();
		System.out.println("Operand"+operand+"no1"+no1+"no2"+no2);

			switch (operand) {
			case 1:
				System.out.println("Adding");
				ans=addition(no1, no2);
				break;
			case 2:
				ans=sub(no1, no2);
				break;
			case 3:
				ans=mul(no1, no2);
				break;
			case 4:
				ans=div(no1, no2);
				break;
			default:
				break;
			}
		pojo.setAns(ans);
		System.out.println(ans);
		System.out.println(pojo.getAns());
		return pojo.getAns();
	
		
	}
}
