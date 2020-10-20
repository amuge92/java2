package lee.CyDAO;

public class cy_DAOfactory {

	public cy_DAO getdao(String dao){
		cy_DAO da = new cy_musicDAO();
		if(dao.equals("musicDAO"))
			da =  new cy_musicDAO();
		else if(dao.equals("boardDAO"))
			da=  new cy_boardDAO();
		else if(dao.equals("videoDAO"))
			da= new cy_videoDAO();
		else if(dao.equals("photoDAO"))
			da= new cy_photoDAO();
		return da;
	}
	
}
