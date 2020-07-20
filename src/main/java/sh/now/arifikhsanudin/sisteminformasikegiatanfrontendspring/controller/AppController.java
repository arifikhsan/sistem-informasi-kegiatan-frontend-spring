package sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sh.now.arifikhsanudin.sisteminformasikegiatanfrontendspring.repository.TodoRepository;

@Controller
public class AppController {

    private TodoRepository todoRepository = new TodoRepository();

    @GetMapping(path = "/kegiatan")
    public String index(Model model) {
        model.addAttribute("todos", todoRepository.all());
        return "kegiatan";
    }
}
