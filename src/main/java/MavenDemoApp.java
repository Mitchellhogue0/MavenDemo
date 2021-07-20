import com.google.gson.Gson;

public class MavenDemoApp {

    public static void main(String[] args) {

        Computer computer = new Computer("EVGA", "RaptorX Pro", true);

        String computerJson = new Gson().toJson(computer);

        System.out.println(computerJson);
    }
}
