package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.repository;

import org.springframework.web.reactive.function.client.WebClient;
import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model.TodoModel;

import java.util.ArrayList;

public class TodoRepository {

    public WebClient client = WebClient.create("http://localhost:8080");

    public Iterable<TodoModel> all() {
        WebClient.RequestHeadersSpec request = client.get().uri("/todo/all");
        TodoModel res = request.retrieve().bodyToMono(TodoModel.class).block();
        System.out.println(res);
        ArrayList<TodoModel> todos = new ArrayList<TodoModel>();
        todos.add(new TodoModel((long) 1, "aa", false));
        return todos;
    }
}
