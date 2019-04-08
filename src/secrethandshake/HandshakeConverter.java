package secrethandshake;

import java.util.*;

public class HandshakeConverter {

    static boolean truefalse = true;
    private Integer price;

    public Integer askPrice() {
        System.out.println("Agent enters the shop and look for something and then he asks 'Hi, how much does this cost?' \n Salesman says a price. (enter a number here) \n");
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextInt();
        System.out.println("It costs " + price + " Euro/s");
        return price;
    }


    private List<String> translateIntoSecretHandshakeMoves(Integer price) {
        List<Integer> digits = priceToDigits(price);
        List<String> movements = toMovements(digits);
        return movements;
    }

    private List<Integer> priceToDigits(Integer price) {
        List<Integer> digits = new ArrayList<>();
        String number = String.valueOf(price);
        for (Integer digit = 0; digit < number.length(); digit++) {
            int numberOne = price % 10;
            digits.add(numberOne);
            price = (price / 10);
        }
        Collections.reverse(digits);
        return digits;
    }

    private Map<Integer, String> availableMovements = getAvailableMovements();

    private HashMap<Integer, String> getAvailableMovements() {
        HashMap<Integer, String> movements = new HashMap<>();
        movements.put(2, "thumb touches back");
        movements.put(5, "tickles over palm");
        movements.put(6, "bro knock");
        movements.put(9, "thousand knuckles");
        return movements;
    }

    private List<String> toMovements(List<Integer> priceDigits) {
        if (priceDigits==null) {
            return new ArrayList<>();
        }
        List<String> order = new ArrayList<>();
        for (Integer digit : priceDigits) {
            if (availableMovements.containsKey(digit)) {
                order.add(availableMovements.get(digit));
            }
        }
        return order;
    }

    public List<String> getAgentHandshake(Integer number) {
        if (number==null ) {
            return new ArrayList<>();
        }
        List<String> rightOrder = translateIntoSecretHandshakeMoves(number);
        System.out.println("For the sake of testing the application, Agent handshake order according to this price have to be: " + rightOrder +
                " \nType every step of Agent's handshake in the right order and press Enter. Double press Enter when it's done: ");
        return rightOrder;
    }

    public String shopAssistant(List<String> trueOrder, List<String> agentHandshakeOrder) {
        if (trueOrder.equals(agentHandshakeOrder)) {
            return giveSecretAgentTheSecretMission();
        }
        return vaporiseImpostorWithLaserRay();
    }

    private String giveSecretAgentTheSecretMission() {
        return "\n It's correct. Salesman will give him the secret mission";
    }

    private String vaporiseImpostorWithLaserRay() {
        return "\nThat is not correct. Salesman will push the bottom and he will vaporize the impostor.";
    }

    public List<String> getAnswerFromUser() {
        Scanner input = new Scanner(System.in);
        List<String> agentHandshake = new ArrayList<>();
        while (truefalse)
        {
            String answer = input.nextLine();
            if (answer.equals("")) {
                truefalse = false;
            }
            else
                agentHandshake.add(answer);
        }
        input.close();
        return agentHandshake;
    }
}
