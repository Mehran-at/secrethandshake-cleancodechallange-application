package secrethandshake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HandshakeConverterTest {
HandshakeConverter handshakeConvertor = new HandshakeConverter();
    @Test
    void convertNumberToList() throws Exception{
        List<Integer> expected = Arrays.asList(2,5,6,9);
        Integer number = 2569;
        List<Integer> actual = handshakeConvertor.convertNumberToList(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void translateIntoSecretHandshakeMoves() {
        List<String> expected = Arrays.asList("thousand knuckles", "bro knock", "tickles over palm", "thumb touches back");
        Integer number = 9652;
        List<String> actual = handshakeConvertor.translateIntoSecretHandshakeMoves(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void areEqual() {
        List<String> trueHandshakeOrder = Arrays.asList("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles");
        List<String> givenOrder = Arrays.asList("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles");
        boolean actual = handshakeConvertor.areEqual(trueHandshakeOrder,givenOrder);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void areEqualTwo() {
        List<String> trueHandshakeOrder = new ArrayList<>();
        List<String> givenOrder = Arrays.asList("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles");
        boolean actual = handshakeConvertor.areEqual(trueHandshakeOrder,givenOrder);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAgentHandshake() {
        Integer number = 357895662;
        List<String> expected = Arrays.asList("tickles over palm", "thousand knuckles", "tickles over palm", "bro knock", "bro knock", "thumb touches back");
        List<String> actual = handshakeConvertor.getAgentHandshake(number);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shopAssistant() {
        Integer number = 357895662;
        List<String> l1 = handshakeConvertor.translateIntoSecretHandshakeMoves(number);
        List<String> l2 = handshakeConvertor.getAgentHandshake(number);
        String actual = handshakeConvertor.shopAssistant(l1,l2);
        String expected = "\nIt's correct. Salesman will give him the secret mission";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shopAssistantTwo() {
        Integer number = 357895662;
        List<String> l1 = new ArrayList<>();
        l1.add("thumb touches back");
        List<String> l2 = handshakeConvertor.getAgentHandshake(number);
        String actual = handshakeConvertor.shopAssistant(l1,l2);
        String expected = "\nThat is not correct. Salesman will push the bottom and he will vaporize the impostor.";
        Assertions.assertEquals(expected, actual);

    }
}