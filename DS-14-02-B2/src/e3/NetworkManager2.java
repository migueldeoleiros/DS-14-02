package e3;

import java.util.*;
import java.util.stream.Collectors;

public class NetworkManager2 implements NetworkManager{
    Map<String, List<TopicOfInterest>> map = new LinkedHashMap<>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
        ArrayList<TopicOfInterest> arrayList = new ArrayList<>(topicsOfInterest);
        map.put(user, arrayList);
    }

    @Override
    public void removeUser(String user) {
        map.remove(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        map.get(user).add(topicOfInterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        map.get(user).remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {
        return new ArrayList<>(map.keySet());
    }

    @Override
    public List<TopicOfInterest> getInterests() {
        List<TopicOfInterest> listTopics = new ArrayList<>();
        for(List<TopicOfInterest> i : map.values()){
            listTopics.addAll(i);
        }

        return listTopics.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        return map.get(user);
    }
}
