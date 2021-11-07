package e3;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    TopicOfInterest sports = new TopicOfInterest("sports");
    TopicOfInterest politics = new TopicOfInterest("politics");
    TopicOfInterest science = new TopicOfInterest("science");
    TopicOfInterest tech = new TopicOfInterest("technology");
    TopicOfInterest languages = new TopicOfInterest("languages");

    void addRemoveUserTest(Network network){
        List<String> userList = List.of(new String[]{"Paco", "Alberto", "AlbertoJunior", "Laura", "Roberto"});
        assertEquals(userList, network.getUsers());

        network.removeUser("AlbertoJunior");

        userList = List.of(new String[]{"Paco", "Alberto", "Laura", "Roberto"});
        assertEquals(userList, network.getUsers());
    }

    void addRemoveInterestTest(Network network, TopicOfInterest[] interests, TopicOfInterest[] interests2){
        assertEquals(Arrays.asList(interests), network.getInterestsUser("Paco"));

        network.addInterest("Paco", languages);
        network.removeInterest("Paco", sports);

        assertEquals(Arrays.asList(interests2), network.getInterestsUser("Paco"));
    }

    void getInterestsTest(Network network){
        TopicOfInterest[] interests = {sports,politics,science,tech,languages};
        assertEquals(Arrays.asList(interests), network.getInterests());
    }

    void compareTest(Network network, TopicOfInterest[] interests1){
        assertEquals(Arrays.asList(interests1), network.compareUsers("Roberto", "Alberto"));
    }

    void toStringTest(Network network){
        assertEquals("""
                        Paco: sports politics\s
                        Alberto: science technology\s
                        Laura: languages politics\s
                        Roberto: sports languages politics science technology\s
                        """
        , network.toString());
    }

    void testNetwork(Network network){
        TopicOfInterest[] interests = {sports,politics};
        network.addUser("Paco", Arrays.asList(interests));

        TopicOfInterest[] interests1 = {science,tech};
        network.addUser("Alberto", Arrays.asList(interests1));

        network.addUser("AlbertoJunior", Arrays.asList(interests1));

        TopicOfInterest[] interests2 = {languages,politics};
        network.addUser("Laura", Arrays.asList(interests2));

        TopicOfInterest[] interests3 = {sports,languages,politics,science,tech};
        network.addUser("Roberto", Arrays.asList(interests3));

        addRemoveUserTest(network);
        addRemoveInterestTest(network, interests, interests2);
        getInterestsTest(network);
        compareTest(network, interests1);
        toStringTest(network);
    }

    @Test
    void testNetwork1(){
        NetworkManager nm1 = new NetworkManager1();
        Network network = new Network(nm1);

        testNetwork(network);
    }

    @Test
    void testNetwork2(){
        //NetworkManager nm2 = new NetworkManager2();
        //Network network = new Network(nm2);

        //testNetwork(network);
    }

}
