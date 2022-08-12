package hash_pass2;

import java.util.Scanner;

/**
 * A class that manages a single chat session between a user and a chatbot.
 * The chat session can be started by running this class. See the main method
 * for more details.
 * 
 * 
 */
public class ChatWithUser {
    

    /**
     * Runs a single chatbot session by creating a Chatter object
     * and then passing it inputs from the user until the user
     * types "stop".
     * 
     * This method also takes care of printing the chatbot responses.
     */
    public static void main(String[] args) {
    	// Make a new Chatter bot with a greeting, a goodbye phrease, and a file of words and responses.
    	Chatter bot = new Chatter("ENTER SECRETS. I NEED IT",
    			"Your secrets were yummy.",
    			"src/hash_pass2/crypt.txt");
 
    	// Start the session with a greeting
    	System.out.println("PAPA FRANKU: " + bot.sayHello());
    	
    	// Prepare to read user input from the console
    	Scanner userInput = new Scanner(System.in);
    	
    	// Loop until "stop" is typed - the loop stops from the break command
    	while (true) {
    		// Get the user text
    		System.out.print("User: ");
    		String userResponse = userInput.nextLine();

    		if (userResponse.equals("stop"))
    			break;
    		
    		// Compute and print the chatbot response
    		String botResponse = bot.respondToPhrase(userResponse);
    		System.out.println("Chatbot: " + botResponse);

    	}
    	// End the session with a goodbye phrase
		System.out.println("Chatbot: " + bot.sayGoodbye());

    }
}
