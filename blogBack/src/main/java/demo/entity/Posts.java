package demo.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Posts {
	private Long post_id;
	private String post_author;
	private Date post_publish_date;//对应datetime需设置set
	private String post_content;
	private String post_title;
	private String post_excerpt;
	private int post_status;
	private String post_name;
	private String post_picture;
	

	public Long getPost_id() {
		return post_id;
	}
	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}
	public String getPost_author() {
		return post_author;
	}
	public void setPost_author(String post_author) {
		this.post_author = post_author;
	}
	public Date getPost_publish_date() {
		//return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(post_publish_date); 
		return post_publish_date;
	}
	public void setPost_publish_date(Date post_publish_date) {
//		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
//		f.format(post_publish_date);
		this.post_publish_date = post_publish_date;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_excerpt() {
		return post_excerpt;
	}
	public void setPost_excerpt(String post_excerpt) {
		this.post_excerpt = post_excerpt;
	}
	public int getPost_status() {
		return post_status;
	}
	public void setPost_status(int post_status) {
		this.post_status = post_status;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public String getPost_picture() {
		return post_picture;
	}
	public void setPost_picture(String post_picture) {
		this.post_picture = post_picture;
	}
	@Override
	public String toString() {
		return "Posts [id=" + post_id + ", post_author=" + post_author + ", post_publish_date=" + post_publish_date.toString()
				+ ", post_content=" + post_content + ", post_title=" + post_title + ", post_excerpt=" + post_excerpt
				+ ", post_status=" + post_status + ", post_name=" + post_name + ", post_picture=" + post_picture + "]";
	}
	
	
}
