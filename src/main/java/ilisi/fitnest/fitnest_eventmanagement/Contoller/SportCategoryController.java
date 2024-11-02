package ilisi.fitnest.fitnest_eventmanagement.Contoller;

import ilisi.fitnest.fitnest_eventmanagement.Entity.SportCategory;
import ilisi.fitnest.fitnest_eventmanagement.Service.SportCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sportcategories")
public class SportCategoryController {
    @Autowired
    private SportCategoryService sportCategoryService;
    @GetMapping
    public ResponseEntity<List<SportCategory>> getAllCategories(){
        List<SportCategory> sportcategories = sportCategoryService.getSportCategories();
        return ResponseEntity.ok(sportcategories);
    }
}
