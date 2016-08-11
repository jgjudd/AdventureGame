import java.util.Scanner;

public class Woods {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("You're walking throught the woods. There is no one around you and your phone is dead.");
		System.out.println(
				"Suddenly, out of the corner of your eye you spot him, Shia Lebouf, with blood all over his face.");
		System.out.println("What do you do? Continue walking or Run away?");

		String action1 = scan.nextLine();

		if (action1.equalsIgnoreCase("Run away")) {
			System.out.println(
					"You run away, deeper into the woods. He drops to all four leg and breaks into a full blown sprint.");
			System.out.println("Shia Labouf is gaining on you...");
			
				if (action1.equalsIgnoreCase("Run away")) {
				System.out.println("Then, in the distance, you see a small, dimly lit cottage.");
				System.out.println("Now what do you do? Run the other way or Run for the cabin?");
				} 
				
					String action2 = scan.nextLine();

					if (action2.equalsIgnoreCase("Run the other way")) {
						System.out.println(
						"You head down a hill and your leg gets caught in a bear trap. Shia feasts on what's left. The End.");
						return;
					} else if (action2.equalsIgnoreCase("Run for the cabin")) {
						System.out.println(
						"You burst through the cabin door, yelling for help. And there he sits, smoking a pipe...with his back to you.");
						System.out.println(
						"But he doesn't see you or the axe you picked up on the front porch. What do you do? Chop off his head or flee?");
					 
					
							String action3 = scan.nextLine();

							if (action3.equalsIgnoreCase("Chop off his head")) {
								System.out.println(
										"You swing the axe, but as you do he disappears. This was all a dream. Don't let your dreams be dreams. The End.");
								return;
							} else if (action3.equalsIgnoreCase("flee")) {
								System.out.println(
									"You flee, but your leg gets caught in a bear trap. That is where your story ends. The End.");
								return;
							} else
								System.out.println("Shia has had enough of your mispelling. You die quickly. The End.");
					}
					else
						System.out.println("Don't let your dreams be dreams. Try again. DOOOOOOO IT!");
						return;

				
			
		} else if (action1.equalsIgnoreCase("Continue walking")) {
			System.out.println("Shia Labouf senses your weakness and his is upon you within seconds.");
			System.out.println("No one every sees or hears from you again. The End.");
			return;
		} else
			System.out.println("Don't let your dreams be dreams. Try again. DOOOOOOO IT!");
			return;
		
		
	}
		
}


