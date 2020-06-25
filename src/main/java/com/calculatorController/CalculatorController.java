package com.calculatorController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.calculatorService.Service;
import com.calculatorpojo.CalculatorPojo;

@Controller
public class CalculatorController {
	CalculatorPojo pojo = new CalculatorPojo();

	@RequestMapping("/val")
	public ModelAndView val(@RequestParam("no") String no, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside val ");
		String screen;
		if (pojo.getOperand() == -1) {
			pojo.setN1(no);
			screen = pojo.getN1();
		} else {
			pojo.setN2(no);
			screen = pojo.getN2();
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("index.jsp");
		view.addObject("screen", screen);
		return view;
	}

	@RequestMapping("/clear")
	public ModelAndView clear(HttpServletRequest request, HttpServletResponse response) {
		// System.out.println("Inside clear");
		// request.setAttribute("screen", 0);
		ModelAndView view = new ModelAndView();
		pojo.clear();
		view.setViewName("index.jsp");
		view.addObject("screen", 0);
		return view;
	}

	@RequestMapping("/operation")
	public ModelAndView operation(@RequestParam("operand") int operand, HttpServletRequest request,
			HttpServletResponse response) {
		pojo.setOperand(operand);
		char op = ' ';
		if (operand == 1)
			op = '+';
		if (operand == 2)
			op = '-';
		if (operand == 3)
			op = '*';
		if (operand == 4)
			op = '/';
		ModelAndView view = new ModelAndView();
		view.setViewName("index.jsp");
		view.addObject("screen", op);
		return view;
	}

	@RequestMapping("/ans")
	public ModelAndView ans(HttpServletRequest request, HttpServletResponse response) {
		Service service = new Service();
		int no1=Integer.parseInt(pojo.getN1());
		int no2 = Integer.parseInt(pojo.getN2());
		
		int ans = service.operation(no1, no2, pojo.getOperand());
		request.setAttribute("screen", ans);
		pojo.clear();
		System.out.println(ans + "=" + pojo.getNo1() + "" + pojo.getOperand() + "" + pojo.getNo2());
		ModelAndView view = new ModelAndView();
		view.setViewName("index.jsp");
		return view;
	}
}
