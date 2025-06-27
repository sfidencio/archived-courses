package posts.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	// private LocalDate moment;
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> listComments = null;

	public Post() {
		super();
		if (this.listComments == null)
			this.listComments = new ArrayList<Comment>(0);
	}

	public void addComment(Comment comment) {
		this.listComments.add(comment);
	}

	public List<Comment> getListPosts() {
		return this.listComments;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		/*
		 * return "Post [moment=" + moment + ", title=" + title + ", content=" + content
		 * + ", likes=" + likes + ", listComments=" + listComments + "]";
		 */

		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - " + sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: " + "\n");
		this.listComments.forEach(item -> {
			sb.append(item.getText() + "\n");
		});
		return sb.toString();

	}

}
