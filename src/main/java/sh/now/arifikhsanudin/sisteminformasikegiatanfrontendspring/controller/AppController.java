package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.model.TodoModel;
import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.repository.TodoRepository;

@Controller
public class AppController {

    private TodoRepository todoRepository = new TodoRepository();

    @GetMapping(path = "/kegiatan")
    public String index(Model model) {
        model.addAttribute("todos", todoRepository.all());
        model.addAttribute("newTodo", new TodoModel());
        return "kegiatan";
    }

    @PostMapping(path = "/submitKegiatan")
    public String submitTodo(@ModelAttribute TodoModel todoModel) {
        todoRepository.addTodo(new TodoModel(todoModel.getName()));
        return "redirect:/kegiatan";
    }

    @PostMapping(path = "/toggleTodo/{id}")
    public String toggleTodo(@PathVariable Long id) {
        todoRepository.toggleTodo(id);
        return "redirect:/kegiatan";
    }

    @PostMapping(path = "/deleteTodo/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteTodo(id);
        return "redirect:/kegiatan";
    }
}
