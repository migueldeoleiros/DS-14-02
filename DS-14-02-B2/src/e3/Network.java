package e3;

import javax.naming.NameNotFoundException;
import java.util.List;

public class Network {
    NetworkManager nm;
    public Network(NetworkManager nm) {
        this.nm = nm;
    }

    public void addUser(String user, List<TopicOfInterest> topicsOfInterest){
        nm.addUser(user, topicsOfInterest);
    }
    public void removeUser(String user) throws NameNotFoundException{
        nm.removeUser(user);
    }
    public void addInterest(String user, TopicOfInterest topicOfInterest) throws NameNotFoundException {
        nm.addInterest(user, topicOfInterest);
    }
    public void removeInterest(String user, TopicOfInterest topicOfInterest) throws NameNotFoundException {
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
    //compare
    //toString
}
