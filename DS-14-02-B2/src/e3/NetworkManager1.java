package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NetworkManager1 implements NetworkManager {
    List<List<TopicOfInterest>> matriz= new ArrayList<>();
    List<String> userList= new ArrayList<>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
        userList.add(user);
        matriz.add(topicsOfInterest);
    }

    @Override
    public void removeUser(String user){
        int userNum=userList.indexOf(user);
        if (userNum==-1)
            throw new IllegalArgumentException();
        userList.remove(userNum);
        matriz.remove(userNum);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest){
        int userNum=userList.indexOf(user);
        if (userNum==-1) throw new IllegalArgumentException();
        List<TopicOfInterest> listInterests= matriz.get(userNum);
        listInterests.add(topicOfInterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest){
        int userNum = userList.indexOf(user);
        if (userNum == -1) throw new IllegalArgumentException();
        List<TopicOfInterest> listUser = matriz.get(userNum);
        listUser.remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {
        return userList;
    }

    @Override
    public List<TopicOfInterest> getInterests() {
        List<TopicOfInterest> listTopics = new ArrayList<>();
        for(List<TopicOfInterest> i : matriz){
            listTopics.addAll(i);
        }

        return listTopics.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        int userNum= userList.indexOf(user);
        if(userNum == -1) throw new IllegalArgumentException();
        return matriz.get(userNum);
    }
}
