package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.repository;

import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model.TodoModel;

import java.util.ArrayList;

public class TodoRepository {

    public Iterable<TodoModel> all() {
        ArrayList<TodoModel> todos = new ArrayList<TodoModel>();
        todos.add(new TodoModel("aa", false));
        return todos;
    }
}
