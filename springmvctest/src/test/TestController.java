package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws Exception {
		System.out.println("��Ʈ�ѷ� ��û �Ϸ�");
		
		//3. ȭ�� �׺���̼�
		ModelAndView mav = new ModelAndView();
		String data="";
		for(int i=1; i<=9; i++) {
			data = data+(9+"*"+i+"="+(9*i))+"<br/>";
		}
		mav.addObject("msg",data);
		
		//forward�� ���� ������ ���� - �⺻�� forward
		mav.setViewName("/WEB-INF/jsp/result.jsp");		
		
		return mav;
	}

}
