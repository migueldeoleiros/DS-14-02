package e3;

import java.util.ArrayList;
import java.util.List;

public class Network {
    NetworkManager nm;      //Creamos una instancia de nuestra interfaz

    /**
     * constructor de Network.
     */
    public Network(NetworkManager nm) {
        this.nm = nm;
    }

    /**
     * Anade usuario e intereses a la base de datos.
     * @param user nombre del usuario
     * @param topicsOfInterest lista de intereses del usuario
     */
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest){
        nm.addUser(user, topicsOfInterest);
    }

    /**
     * Borra usuario de la base de datos.
     * @param user nombre del usuario
     */
    public void removeUser(String user){
        nm.removeUser(user);
    }

    /**
     * Anade interes a un usuario dado.
     * @param user nombre del usuario
     * @param topicOfInterest nuevo intereses del usuario
     */
    public void addInterest(String user, TopicOfInterest topicOfInterest){
        nm.addInterest(user, topicOfInterest);
    }

    /**
     * Borra interes a un usuario dado.
     * @param user nombre del usuario
     * @param topicOfInterest interes a borrar
     */
    public void removeInterest(String user, TopicOfInterest topicOfInterest){
        nm.removeInterest(user, topicOfInterest);
    }

    /**
     * Lista de usuarios.
     * @return lista con los nombres de usuarios guardados
     */
    public List<String> getUsers() {
        return nm.getUsers();
    }

    /**
     * Lista de intereses de todos los usuarios.
     * @return lista con todos los intereses guardados
     */
    public List<TopicOfInterest> getInterests() {
        return nm.getInterests();
    }

    /**
     * Lista de intereses de un usuario.
     * @param user nombre del usuario
     * @return lista de intereses de un usuario
     */
    public List<TopicOfInterest> getInterestsUser(String user) {
        return nm.getInterestsUser(user);
    }

    /**
     * Lista de intereses en comun de dos usuarios.
     * @param user1 nombre de un usuario
     * @param user2 nombre del otro usuario
     * @return lista de intereses en comun
     */
    public List<TopicOfInterest> compareUsers(String user1, String user2) {
        List<TopicOfInterest> listTopics = new ArrayList<>();
        List<TopicOfInterest> topics1 = nm.getInterestsUser(user1);
        List<TopicOfInterest> topics2 = nm.getInterestsUser(user2);

        for(TopicOfInterest i : topics1){
            if(topics2.contains(i)) listTopics.add(i);
        }
        return listTopics;
    }

    /**
     * Lista de usuarios y sus intereses.
     * @return String con todos los usuarios y sus intereses
     */
    public String toString(){
        StringBuilder output = new StringBuilder();
        for(String i : nm.getUsers()){
            output.append(i).append(": ");
            for(TopicOfInterest j : nm.getInterestsUser(i)){
                output.append(j.toString()).append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }
}
