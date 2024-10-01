package ru.vershinin.MyFirstTestAppSpringBoot.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShowArrayList {
    // Метод для отображения всех элементов ArrayList
    @GetMapping("/show-array")
    public String showArrayList() {

        if (UpdateArrayList.arrayList == null || UpdateArrayList.arrayList.isEmpty()) {
            return "The list is empty.";
        }
        return String.format("Current list: %s", UpdateArrayList.arrayList);
    }
}
