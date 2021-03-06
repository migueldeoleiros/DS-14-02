package e3;

import java.util.List;

interface NetworkManager {       //Creamos la interfaz la cual contiene las cabeceras de nuestros metodos

    //añade un usuario a la red
    void addUser(String user, List<TopicOfInterest> topicsOfInterest);

    //elimina un usuario de la red
    void removeUser(String user);

    //añade un tema de interes a un usuario
    void addInterest(String user, TopicOfInterest topicOfInterest);

    //elimina un tema de interes a un usuario
    void removeInterest(String user, TopicOfInterest topicOfInterest);

    //devuelve una lista con todos los usuarios registrados
    List <String> getUsers();

    //devuelve una lista con todos los temas que interesan a los usuarios
    List<TopicOfInterest> getInterests();

    //devuelve los temas de interes para un usuario determinado
    List<TopicOfInterest> getInterestsUser(String user);
}
