package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.repository;

import org.springframework.web.client.RestTemplate;
import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model.GetTodosResponse;
import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model.TodoModel;

import java.util.ArrayList;
import java.util.Map;

public class TodoRepository {

    public String baseUrl = "http://localhost:8080";
    public RestTemplate restTemplate = new RestTemplate();

    public ArrayList<TodoModel> all() {
        GetTodosResponse getTodosResponse = restTemplate.getForObject(baseUrl + "/todo/all", GetTodosResponse.class);
        ArrayList<TodoModel> todos = new ArrayList<>();
        if (getTodosResponse != null) {
            todos = getTodosResponse.getData();
        }
        return todos;
    }

    public void addTodo(TodoModel todoModel) {
        restTemplate.postForObject(baseUrl + "/todo/add", todoModel, TodoModel.class);
    }

    public void toggleTodo(Long id) {
        restTemplate.put(baseUrl + "/todo/toggle/" + id, null);
    }

    public void deleteTodo(Long id) {
        restTemplate.delete(baseUrl + "/todo/destroy/" + id);
    }
}
