package e3;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Network1 implements NetworkManager {
    List<List<TopicOfInterest>> matriz= new ArrayList<>();
    List<String> userList= new ArrayList<>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
        userList.add(user);
        matriz.add(topicsOfInterest);
    }

    @Override
    public void removeUser(String user) throws NameNotFoundException {
        int userNum=userList.indexOf(user);
        if (userNum==-1)
            throw new NameNotFoundException();
        userList.remove(userNum);
        matriz.remove(userNum);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) throws NameNotFoundException {
        int userNum=userList.indexOf(user);
        if (userNum==-1)
            throw new NameNotFoundException();
        matriz.get(userNum).add(topicOfInterest);
        }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) throws NameNotFoundException {
        int userNum = userList.indexOf(user);
        if (userNum == -1)
            throw new NameNotFoundException();
        List<TopicOfInterest> listUser = matriz.get(userNum);
        listUser.remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {
        return userList;
    }

    @Override
    public List<TopicOfInterest> getInterests() {
        return null;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        List<TopicOfInterest> listTopics = new ArrayList<>();
        int userNum= userList.indexOf(user);
        return listTopics;
    }
}
