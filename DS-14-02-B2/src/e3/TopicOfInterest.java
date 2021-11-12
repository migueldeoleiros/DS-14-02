package e3;

public class TopicOfInterest {
    private final String TopicName;

    public TopicOfInterest(String topicName) {
        this.TopicName = topicName;
    }

    @Override
    public String toString() {
        return TopicName;
    }
}
