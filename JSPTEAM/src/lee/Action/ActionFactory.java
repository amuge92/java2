package lee.Action;

public class ActionFactory {

	public Action createAction(String command) {
		Action action =  new cy_homeAction();
		if (command.equals("cy_video.jsp"))
			return new cy_videoAction();
		else if (command.equals("cy_videoLE.jsp"))
			return new cy_videoActionLE();
		else if (command.equals("cy_board.jsp"))
			return new cy_boardAction();
		else if (command.equals("cy_boardLE.jsp"))
			return new cy_boardActionLE();
		else if (command.equals("cy_home.jsp"))
			return new cy_homeAction();
		else if (command.equals("cy_homeLE.jsp"))
			return new cy_homeActionLE();
		else if (command.equals("cy_music.jsp"))
			return new cy_musicAction();
		else if (command.equals("cy_musicLE.jsp"))
			return new cy_musicActionLE();
		else if (command.equals("cy_photo.jsp"))
			return new cy_photoAction();
		else if (command.equals("cy_photoLE.jsp"))
			return new cy_photoActionLE();
		else if (command.equals("cy_visitor.jsp"))
			return new cy_visitorAction();
		else if (command.equals("cy_visitorLE.jsp"))
			return new cy_visitorActionLE();
		else if (command.equals("cy_MainForm.jsp"))
			return new cy_MainFormAction();
		else if (command.equals("cy_boardContent.jsp"))
			return new cy_boardContentAction();
		else if (command.equals("cy_videoContents.jsp"))
			return new cy_videoContentsAction();
		else if(command.equals("cy_visitorInsert"))
			return new cy_visitorInsertAction();
		else if(command.equals("createAction"))
			return new createAction();
		else	
		return action;
		
		
		

	}

}
