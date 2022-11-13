package module13.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpRequestsGetComment {
    private Gson gson = new Gson();
    public void getComment(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        Type type = TypeToken.getParameterized(List.class, Post.class).getType();
        List<Post> json = gson.fromJson(response, type);
        int x = 0;
        int y = 0;
        for (Post j: json) {
            if (j.getId() > y){
                x = j.getUserId();
                y = j.getId();
            }
        }
        String uri = "https://jsonplaceholder.typicode.com/posts/" + y + "/comments";
        HttpRequest requestComment = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
        String responseComment = client.send(requestComment, HttpResponse.BodyHandlers.ofString()).body();
        try (FileWriter fileWriter = new FileWriter(new File("user-" + x + "-post-" + y + "-comments.json"))){
            fileWriter.write(responseComment);
            fileWriter.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
