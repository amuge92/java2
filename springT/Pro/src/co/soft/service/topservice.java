package co.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import co.soft.beans.Boardinfo;
import co.soft.dao.topdao;

@Service
public class topservice {

	@Autowired
	private topdao tdao;

	public List<Boardinfo> get_toplist() {
		System.out.println("¼­ºñ½º");
		List<Boardinfo> li = tdao.get_toplist();
		return li;
	}

}
