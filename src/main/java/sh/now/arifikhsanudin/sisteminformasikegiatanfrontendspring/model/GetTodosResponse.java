package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model;

import java.util.ArrayList;

public class GetTodosResponse {
    private ArrayList<TodoModel> data;

    public GetTodosResponse() {
    }

    public GetTodosResponse(ArrayList<TodoModel> data) {
        this.data = data;
    }

    public ArrayList<TodoModel> getData() {
        return data;
    }

    public void setData(ArrayList<TodoModel> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetTodosResponse{" +
                "data=" + data +
                '}';
    }
}
