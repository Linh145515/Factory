package observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer {
    private List<String> statuses = new ArrayList<>();

    @Override
    public void update(String status) {
        statuses.add(status);
    }

    public void showFeed() {
        System.out.println("Feed:");
        for (String s : statuses) {
            System.out.println("- " + s);
        }
    }
}