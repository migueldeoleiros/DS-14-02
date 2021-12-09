package e3;

import java.util.*;
import java.util.stream.Collectors;

public class NetworkManager2 implements NetworkManager{
    private final Map<String, List<TopicOfInterest>> map = new LinkedHashMap<>();     //Creamos nuestro hashMapLinkeado

    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {      //Añadimos un user
        ArrayList<TopicOfInterest> arrayList = new ArrayList<>(topicsOfInterest);
        map.put(user, arrayList);
    }

    @Override
    public void removeUser(String user) {       //Eliminamos un user
        map.remove(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {     //Agregamos un interes a un user
        map.get(user).add(topicOfInterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {      //Eliminamos un interest de un
        map.get(user).remove(topicOfInterest);                                      //user concreto
    }

    @Override
    public List<String> getUsers() {        //Retornamos la lista de usuarios
        return new ArrayList<>(map.keySet());
    }

    @Override
    public List<TopicOfInterest> getInterests() {       //Retornamos la lista de temas que le interesan al menos a un user
        List<TopicOfInterest> listTopics = new ArrayList<>();
        for(List<TopicOfInterest> i : map.values()){
            listTopics.addAll(i);
        }

        return listTopics.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {        //Retornamos los temas que le interesan a un user
        return map.get(user);                                           //determinado
    }
}
