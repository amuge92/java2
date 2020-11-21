package co.soft.intercepter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import co.soft.beans.Boardinfo;
import co.soft.service.topservice;
//���ͼ��ʹ� ������̾� �Ұ���
public class topintercepter implements HandlerInterceptor {


	private topservice tservice;
	
	public topintercepter(topservice tservice) {
		this.tservice = tservice;
	}//�����ڷ� �Ѱܼ� �� ���� ����.... ���ͼ��Ϳ����� �ڵ������� ���� �� ���Թ��� �� �Ѵ�...
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response) {
		List<Boardinfo> topmenu = tservice.get_toplist();
		request.setAttribute("topmenu", topmenu);
		
		return true;
	}
	
	
	
}
