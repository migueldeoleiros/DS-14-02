package e3;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Network {
    NetworkManager nm;
    public Network(NetworkManager nm) {
        this.nm = nm;
    }

    public void addUser(String user, List<TopicOfInterest> topicsOfInterest){
        nm.addUser(user, topicsOfInterest);
    }
    public void removeUser(String user){
        nm.removeUser(user);
    }
    public void addInterest(String user, TopicOfInterest topicOfInterest){
        nm.addInterest(user, topicOfInterest);
    }
    public void removeInterest(String user, TopicOfInterest topicOfInterest){
        nm.removeInterest(user, topicOfInterest);
    }
    public List<String> getUsers() {
        return nm.getUsers();
    }
    public List<TopicOfInterest> getInterests() {
        return nm.getInterests();
    }
    public List<TopicOfInterest> getInterestsUser(String user) {
        return nm.getInterestsUser(user);
    }

    public List<TopicOfInterest> compareUsers(String user1, String user2) {
        List<TopicOfInterest> listTopics = new ArrayList<>();
        List<TopicOfInterest> topics1 = nm.getInterestsUser(user1);
        List<TopicOfInterest> topics2 = nm.getInterestsUser(user2);

        for(TopicOfInterest i : topics1){
            if(topics2.contains(i)) listTopics.add(i);
        }
        return listTopics;
    }

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
