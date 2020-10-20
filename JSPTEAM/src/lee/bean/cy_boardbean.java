package lee.bean;


public class cy_boardbean {

	private String board_name ,board_writer ,board_date ,board_src ,board_comment;
	private int board_folder,board_cnt;
	private int vNum;
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getBoard_src() {
		return board_src;
	}
	public void setBoard_src(String board_src) {
		this.board_src = board_src;
	}
	public String getBoard_comment() {
		return board_comment;
	}
	public void setBoard_comment(String board_comment) {
		this.board_comment = board_comment;
	}
	public int getBoard_folder() {
		return board_folder;
	}
	public void setBoard_folder(int board_folder) {
		this.board_folder = board_folder;
	}
	public int getBoard_cnt() {
		return board_cnt;
	}
	public void setBoard_cnt(int board_cnt) {
		this.board_cnt = board_cnt;
	}
	public int getvNum() {
		return vNum;
	}
	public void setvNum(int vNum) {
		this.vNum = vNum;
	}
}
