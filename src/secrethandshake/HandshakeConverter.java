package secrethandshake;

import java.util.*;

public class HandshakeConverter {

    public List<Integer> convertNumberToList(Integer num) {
        List<Integer> digits = new ArrayList<>();
        String number = String.valueOf(num);
        for (Integer digit = 0; digit < number.length(); digit++) {
            int numberOne = num % 10;
            digits.add(numberOne);
            num = (num / 10);
        }
        Collections.reverse(digits);
        return digits;
    }

    public List<String> translateIntoSecretHandshakeMoves(Integer number) {

        List<String> givenOrder = new ArrayList<>();

        List<Integer> digits = convertNumberToList(number);

        for (int element = 0; element < digits.size(); element++) {
            if (digits.get(element).equals(2))  {
                givenOrder.add("thumb touches back");
            }
            if (digits.get(element).equals(5)) {
                givenOrder.add("tickles over palm");
            }
            if (digits.get(element).equals(6)) {
                givenOrder.add("bro knock");
            }
            if (digits.get(element).equals(9)) {
                givenOrder.add("thousand knuckles");
            }
        }
    return givenOrder;
    }

    public static boolean areEqual(List<String> a, List<String> b) {
        for (int element = 0; element <= a.size();element++) {
            if (a.equals(b)) {
                return true;
            }
        }
        return  false;
    }

    public List<String> getAgentHandshake(Integer number) {
        List<String> agentHandshakeOrder = translateIntoSecretHandshakeMoves(number);
    return agentHandshakeOrder;
    }

     public String shopAssistant(List<String> trueOrder, List<String> agentHandshakeOrder) {
        if (areEqual(trueOrder, agentHandshakeOrder)) {
            return giveSecretAgentTheSecretMission();
        }

         return vaporiceImpostorWithLaserRay();
    }


    private String giveSecretAgentTheSecretMission() {
        return "\nIt's correct. Salesman will give him the secret mission";
    }

    private String vaporiceImpostorWithLaserRay() {
        return "\nThat is not correct. Salesman will push the bottom and he will vaporize the impostor.";
    }
}
