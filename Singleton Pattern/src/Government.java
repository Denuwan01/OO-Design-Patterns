public class Government {
    private static Government instance;

    private Government() {}

    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }
        return instance;
    }

    public void makeDecision(String decision) {
        System.out.println("The government has made a decision: " + decision);
    }
}

