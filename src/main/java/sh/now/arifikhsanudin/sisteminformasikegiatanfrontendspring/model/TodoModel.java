package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model;

public class TodoModel {
    private Long id;
    private String name;
    private Boolean done;

    public TodoModel() {
    }

    public TodoModel(String name, Boolean done) {
        this.name = name;
        this.done = done;
    }

    public TodoModel(Long id, String name, Boolean done) {
        this.id = id;
        this.name = name;
        this.done = done;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", done=" + done +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
