package ilisi.fitnest.fitnest_eventmanagement.Service.Impl;

import ilisi.fitnest.fitnest_eventmanagement.Entity.SportCategory;
import ilisi.fitnest.fitnest_eventmanagement.Repository.SportCategoryRepository;
import ilisi.fitnest.fitnest_eventmanagement.Service.SportCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportCategoryImpl implements SportCategoryService {
    @Autowired
    private SportCategoryRepository sportCategoryRepository;
    @Override
    public List<SportCategory> getSportCategories() {
        return sportCategoryRepository.findAll();
    }
}
