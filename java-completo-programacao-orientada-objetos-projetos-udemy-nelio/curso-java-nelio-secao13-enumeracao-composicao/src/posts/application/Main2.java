package posts.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import posts.entities.Comment;
import posts.entities.Post;

public class Main2 {
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

			//Aqui estamos utilizando o toString()
			System.out.println(p1);
			
			
			Post p2 = new Post();
			p2.setMoment(sdf1.parse("28/07/2018 23:14:19"));
			p2.setTitle("Good Night Guys");
			p2.setContent("See you tomorrow!");
			p2.setLikes(5);
			p2.addComment(new Comment("Good Night!"));
			p2.addComment(new Comment("May the force be with you!"));
			System.out.println(p2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
