package lee.CyDAO;

import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import lee.bean.cy_boardbean;

public interface cy_DAO {
	public void getCon() throws Exception;
	public Object OneContets(int vNum) throws Exception;
	public Vector AllContents();
	public void updateCount(int vNum) throws Exception ;
	public void insertContents(Object obj) throws Exception ;
}