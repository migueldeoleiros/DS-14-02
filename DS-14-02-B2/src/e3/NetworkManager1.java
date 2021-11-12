package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NetworkManager1 implements NetworkManager {
    private final List<List<TopicOfInterest>> matriz= new ArrayList<>();      //Creamos nuestra matriz de usuarios y sus relativos
    private final List<String> userList= new ArrayList<>();                   //temas de interes, asi como la propia lista de users

    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {      //Agregamos un user a la matriz
        ArrayList<TopicOfInterest> arrayList = new ArrayList<>(topicsOfInterest);
        userList.add(user);
        matriz.add(arrayList);
    }

    @Override
    public void removeUser(String user){        //Eliminamos un user
        int userNum=userList.indexOf(user);
        if (userNum==-1)
            throw new IllegalArgumentException();
        userList.remove(userNum);
        matriz.remove(userNum);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest){      //Adjuntamos un nuevo interes al user
        int userNum=userList.indexOf(user);                                     //que le corresponda
        if (userNum==-1) throw new IllegalArgumentException();
        List<TopicOfInterest> listInterests= matriz.get(userNum);
        listInterests.add(topicOfInterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest){       //Eliminamos un interes de un user
        int userNum = userList.indexOf(user);                                       // determinado
        if (userNum == -1) throw new IllegalArgumentException();
        List<TopicOfInterest> listUser = matriz.get(userNum);
        listUser.remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {        //Devolvemos nuestra lista de users
        return userList;
    }

    @Override
    public List<TopicOfInterest> getInterests() {       //Obtenemos la lista de todos los temas que le interesan a
        List<TopicOfInterest> listTopics = new ArrayList<>();       // un user por lo menos, sin duplicados
        for(List<TopicOfInterest> i : matriz){
            listTopics.addAll(i);
        }

        return listTopics.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {        //Obtenemos los temas que le interesan a un user
        int userNum= userList.indexOf(user);                            //determinado
        if(userNum == -1) throw new IllegalArgumentException();
        return matriz.get(userNum);
    }
}
