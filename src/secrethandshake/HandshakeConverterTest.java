package secrethandshake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class HandshakeConverterTest {
    HandshakeConverter handshakeConvertor = new HandshakeConverter();

    static Stream<Arguments> secretHandshakesArguments() {
        return Stream.of(
                Arguments.of(1, new ArrayList<>()),
                Arguments.of(9652, List.of("thousand knuckles", "bro knock", "tickles over palm", "thumb touches back")),
                Arguments.of(2569, List.of("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles"))
        );
    }
//
    @ParameterizedTest
    @MethodSource("secretHandshakesArguments")
    void getSecretHandshakes(int price, List<String> expected) {
        List<String> actual = handshakeConvertor.getAgentHandshake(price);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void convertNumberToList() throws Exception {
//        List<Integer> expected = Arrays.asList(2, 5, 6, 9);
//        Integer number = 2569;
//        List<Integer> actual = handshakeConvertor.convertNumberToList(number);
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void translateIntoSecretHandshakeMoves() {
//        List<String> expected = Arrays.asList();
//        Integer number = ;
//        List<String> actual = handshakeConvertor.translateIntoSecretHandshakeMoves(number);
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void areEqual() {
//        List<String> trueHandshakeOrder = Arrays.asList("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles");
//        List<String> givenOrder = Arrays.asList("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles");
//        boolean actual = handshakeConvertor.areEqual(trueHandshakeOrder, givenOrder);
//        boolean expected = true;
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void areEqualTwo() {
//        List<String> trueHandshakeOrder = new ArrayList<>();
//        List<String> givenOrder = Arrays.asList("thumb touches back", "tickles over palm", "bro knock", "thousand knuckles");
//        boolean actual = handshakeConvertor.areEqual(trueHandshakeOrder, givenOrder);
//        boolean expected = false;
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void getAgentHandshake() {
//        Integer number = 357895662;
//        List<String> expected = Arrays.asList("tickles over palm", "thousand knuckles", "tickles over palm", "bro knock", "bro knock", "thumb touches back");
//        List<String> actual = handshakeConvertor.getAgentHandshake(number);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void shopAssistant() {
//        Integer number = 357895662;
//        List<String> l1 = handshakeConvertor.translateIntoSecretHandshakeMoves(number);
//        List<String> l2 = handshakeConvertor.getAgentHandshake(number);
//        String actual = handshakeConvertor.shopAssistant(l1, l2);
//        String expected = "\nIt's correct. Salesman will give him the secret mission";
//        Assertions.assertEquals(expected, actual);
//
//    }
//
//    @Test
//    void shopAssistantTwo() {
//        Integer number = 357895662;
//        List<String> l1 = new ArrayList<>();
//        l1.add("thumb touches back");
//        List<String> l2 = handshakeConvertor.getAgentHandshake(number);
//        String actual = handshakeConvertor.shopAssistant(l1, l2);
//        String expected = "\nThat is not correct. Salesman will push the bottom and he will vaporize the impostor.";
//        Assertions.assertEquals(expected, actual);
//
//    }
}