package ru.vershinin.MyFirstTestAppSpringBoot.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShowAllLenght {
    @GetMapping("/show-all-length")
    public String showAllLength() {
        // Получаем размеры коллекций из других контроллеров
        int arrayListSize = (UpdateArrayList.arrayList != null) ? UpdateArrayList.arrayList.size() : 0;
        int hashMapSize = (UpdateHashMap.getHashMap() != null) ? UpdateHashMap.getHashMap().size() : 0;

        return String.format("ArrayList contains %d elements and HashMap contains %d elements.", arrayListSize, hashMapSize);
    }
}
