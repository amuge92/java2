package co.soft.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import co.soft.beans.Boardinfo;
import co.soft.mapper.BoardMapper;
import co.soft.mapper.topmapper;

@Repository
public class topdao {

	@Autowired
	private topmapper tmap;//�������̽� ������
	
	public List<Boardinfo> get_toplist(){
		List<Boardinfo> tdao =  tmap.get_toplist();
		return tdao;
		
	}
	
	
	
	
}
