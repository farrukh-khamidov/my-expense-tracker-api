package uz.farrukh.myexpensetrackerapi.services.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.farrukh.myexpensetrackerapi.services.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

//    private final CategoryRepository categoryRepository;
//
//    @Autowired
//    public CategoryServiceImpl(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
//
//
//    @Override
//    public List<Category> fetchAllCategories(Integer userId) {
//        return categoryRepository.findAll(userId);
//    }
//
//    @Override
//    public Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
//        return categoryRepository.findById(userId, categoryId);
//    }
//
//    @Override
//    public Category addCategory(Integer userId, String title, String description) throws ETBadRequestException, EtResourceNotFoundException {
//        int categoryId = categoryRepository.create(userId, title, description);
//        return categoryRepository.findById(userId, categoryId);
//    }
//
//    @Override
//    public void updateCategory(Integer userId, Integer categoryId, Category category) throws ETBadRequestException {
//        categoryRepository.update(userId, categoryId, category);
//    }
//
//    @Override
//    public void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
//        fetchCategoryById(userId, categoryId);
//        categoryRepository.removeById(userId, categoryId);
//    }
}
