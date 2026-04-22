package posts.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import posts.entities.Comment;
import posts.entities.Post;

public class Main {
	/**
	 * @author Sebastiao Fidencio - Classe principal Criar Posts - HardCode (Sem
	 *         edicao)
	 * @version 1.0
	 * @since 2022-04-22
	 *
	 */
	public static void main(String[] args) {
		try {
			Post p1 = new Post();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			// p1.setMoment(sdf1.parse("21/06/2018
			// 13:05:44").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			p1.setMoment(sdf1.parse("21/06/2018 13:05:44"));
			p1.setTitle("Traveling to New Zealand");
			p1.setContent("I'am going to visit this wonderful country!");
			p1.setLikes(12);

			p1.addComment(new Comment("Have a nice trip!"));
			p1.addComment(new Comment("Wow that's awesome!"));
			p1.addComment(new Comment("Commentary of Brazil!"));

			System.out.println(p1.getTitle());
			System.out.println(p1.getLikes() + " Likes - " + sdf1.format(p1.getMoment()));
			System.out.println(p1.getContent());
			System.out.println("Comments: ");
			//Aqui utilizando foreach funcional
			p1.getListPosts().forEach(item -> {
				System.out.println(item.getText());
			});
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
