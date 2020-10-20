package lee.bean;


public class cy_videobean {

	private String video_name ,video_writer ,video_date ,video_src ,video_comment;
	private int video_folder,video_cnt;
	private int vNum;
	public int getvNum() {
		return vNum;
	}
	public void setvNum(int vNum) {
		this.vNum = vNum;
	}
	public int getVideo_cnt() {
		return video_cnt;
	}
	public void setVideo_cnt(int video_cnt) {
		this.video_cnt = video_cnt;
	}
	public String getVideo_name() {
		return video_name;
	}
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	public String getVideo_writer() {
		return video_writer;
	}
	public void setVideo_writer(String video_writer) {
		this.video_writer = video_writer;
	}
	public String getVideo_date() {
		return video_date;
	}
	public void setVideo_date(String video_date) {
		this.video_date = video_date;
	}
	public String getVideo_src() {
		return video_src;
	}
	public void setVideo_src(String video_src) {
		this.video_src = video_src;
	}
	public String getVideo_comment() {
		return video_comment;
	}
	public void setVideo_comment(String video_comment) {
		this.video_comment = video_comment;
	}
	public int getVideo_folder() {
		return video_folder;
	}
	public void setVideo_folder(int video_folder) {
		this.video_folder = video_folder;
	}
	
}
