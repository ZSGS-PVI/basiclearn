package chatbotbasic;
import java.util.Scanner;

public class basicchat {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Hai i am chatbot how can i assiste you");
			Scanner in=new Scanner(System.in);
			
			while(true) {
				System.out.println("you :" );
				String userMessage=in.nextLine();
				
				if(userMessage.equalsIgnoreCase("exit") || userMessage.equalsIgnoreCase("bye")) {
					System.out.println("chatbot: Goodbye Have a Greate Day");
					break;
				}
				String botResponse=getBotResponse(userMessage);
				System.out.println("chatbot: "+botResponse);
			}

		}
		
		public static String getBotResponse(String mes) {
			
			switch(mes.toLowerCase()) {
			
			case "hi":
			case "hello":
				return "Hi There!";
			case "how are you":
				 return "I'm just a program, so I don't have feelings, but thanks for asking!";
			case "what is your name":
				return "i am chatbot you can call me with chat";
			
			 default:
	                return "Sorry, I didn't understand that. Can you ask something else?";	
			
			}
		
		}

	}

