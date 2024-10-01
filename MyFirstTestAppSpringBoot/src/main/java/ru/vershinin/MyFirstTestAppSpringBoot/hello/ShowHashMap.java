package ru.vershinin.MyFirstTestAppSpringBoot.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShowHashMap {
    // Метод для отображения всех элементов HashMap
    @GetMapping("/show-map")
    public String showHashMap() {
        // Используем геттер для доступа к HashMap из предыдущего контроллера
        if (UpdateHashMap.getHashMap() == null || UpdateHashMap.getHashMap().isEmpty()) {
            return "The map is empty.";
        }
        return String.format("Current map: %s", UpdateHashMap.getHashMap());
    }
}
