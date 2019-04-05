package secrethandshake;
//  A point that can be a bug is, if Salesman says a price which has no handshake rules, agent can not do any handshake
//      to be checked and application will be explode in that case. Also when we enter letters instead of numbers for
//      price it will explodes.

//  The terrible thing about my code in this example is one method has a bunch of classes. But that was my order to
//      to create  this app only with one class plus Run class till later I understand where should i create classes,
//      or maybe Interfaces, or maybe I could use extent other class. But for Interface usage, I know already what is
//      going to happen. To my understanding basically everything in HandshakeConverter is HOW.
import java.util.*;

public class SecretHandshakeApplication {
    static boolean truefalse = true;
    public static void main(String[] args) {

        HandshakeConverter handshakeConvertor = new HandshakeConverter();

        System.out.println("Agent enters the shop and look for something and then he asks 'Hi, how much does this " +
                "cost?' \n");
        System.out.println("Salesman says a price. (enter a number here) \n");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        System.out.println("It costs " + price + " Euro/s");


        List<String> rightOrder = handshakeConvertor.getAgentHandshake(price);

        System.out.println("For the sake of testing the application, Agent handshake order according to this price have"
                + " to be: " + rightOrder);

        System.out.println("\n Type every step of Agent's handshake in the right order and press Enter. Double press Enter when it's done: ");

        Scanner input = new Scanner(System.in);
        List<String> agentHandshake = new ArrayList<>();
        while (truefalse)
        {
            String line = input.nextLine();
            if (line.equals(""))
                truefalse = false;
            else
                agentHandshake.add(line);
        }
        input.close();
        System.out.println(agentHandshake);


        System.out.println(handshakeConvertor.shopAssistant(agentHandshake, rightOrder));

    }
}

//Hansel and Matilda watched a movie trailer recently about secret agents and decided to surprise Derek with a film evening this weekend. In the film, the main character enters an electronics shop and asks for the price of a particular item. Then the shop assistant says the price and depending on the numbers of that given price, they have to perform a secret handshake. After doing it right, he receives the secret mission. If he were to fail, then a hidden lasser ray would immediately vaporice him.
//The handshake has the following characteristics:
//  There are four kinds of handshake moves: thumb touches back, tickles over palm, bro knock and thousand knuckles.
//  The different moves of the handshake will be performed exactly in the order that the numbers appear within the price number.
//      - The thumb touches back is performed on the number 2.
//      - The tickles over palm is performed on the number 5.
//      - The bro knock is performed on the number 6.
//      - The thousand knuckles is performed on the number 9.
//  Develop the following code:
//      Define the translateIntoSecretHandshakeMoves action that receives a number and returns the collection containing the different handshakes in order that the secret agent has to perform to receive the secret mission.
//      Define the areEqual action that receives two collections of strings, checks if both contain the same elements in the same order and returns true or false.
//      Write the code that the secret agent uses to ask the price of an item and then translate that number into the secret handshake moves.
//      Write the code that the shop assistant uses to fulfill the following interaction. If the handshake that the secret agent performs is right, then he will give him the secret mission. Otherwise the laser ray will vaporice the impostor.
//          Available actions: giveSecretAgentTheSecretMission(), vaporiceImpostorWithLaserRay()
//------------------------------------------------------------------------------------------------
//Good evening, how much does this item cost?
//195
//(The shop assistant knows the right handshake is the following)
//[“Thousand knuckles”, “Tickles over palm”]
//(If the result of the secret agent is the same, then he will give him the mission)
//(Otherwise he will activate the laser ray and will vaporice the impostor)
//--------------------------------------------------------------------------------------------------