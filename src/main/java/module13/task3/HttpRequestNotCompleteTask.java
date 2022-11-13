package module13.task3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class HttpRequestNotCompleteTask {
    public void notCompleteTask(String url, int id) throws IOException, InterruptedException {
        url = url + "/" + id + "/todos";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        Type type = TypeToken.getParameterized(List.class, UserTask.class).getType();
        Gson gson = new Gson();
        List<UserTask> json = gson.fromJson(response, type);
        List<UserTask> filtred = json.stream().filter(item -> !item.isCompleted()).collect(Collectors.toList());
        for (UserTask filter: filtred){
            System.out.println(filter);
        }
    }
}
