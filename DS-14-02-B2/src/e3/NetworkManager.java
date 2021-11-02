package e3;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public interface NetworkManager {

    //añade un usuario a la red
    void addUser(String user, List<TopicOfInterest> topicsOfInterest);

    //elimina un usuario de la red
    void removeUser(String user) throws NameNotFoundException;

    //añade un tema de interes a un usuario
    void addInterest(String user, TopicOfInterest topicOfInterest) throws NameNotFoundException;

    //elimina un tema de interes a un usuario
    void removeInterest(String user, TopicOfInterest topicOfInterest) throws NameNotFoundException;

    //devuelve una lista con todos los usuarios registrados
    List <String> getUsers();

    //devuelve una lista con todos los temas que interesan a los usuarios
    List<TopicOfInterest> getInterests();

    //devuelve los temas de interes para un usuario determinado
    List<TopicOfInterest> getInterestsUser(String user);
}
