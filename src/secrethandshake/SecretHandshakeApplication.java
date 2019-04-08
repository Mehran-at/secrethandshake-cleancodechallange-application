package secrethandshake;

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
import java.util.*;

public class SecretHandshakeApplication {

    public static void main(String[] args) {

        HandshakeConverter handshakeConverter = new HandshakeConverter();
        List<String> agentHandshake = handshakeConverter.getAgentHandshake(handshakeConverter.askPrice());
        List<String> answer = handshakeConverter.getAnswerFromUser();
        System.out.println(handshakeConverter.shopAssistant(agentHandshake, answer));
    }
}
