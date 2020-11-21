package co.soft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import co.soft.beans.Boardinfo;

public interface topmapper {

	
	@Insert("select * from board_info_table order by board_info_idx")
	List<Boardinfo> get_toplist();
	
}
