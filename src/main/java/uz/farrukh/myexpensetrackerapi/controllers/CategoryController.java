package uz.farrukh.myexpensetrackerapi.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

//    private final CategoryService categoryService;
//
//    @Autowired
//    public CategoryController(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Category>> getAllCategories(HttpServletRequest request) {
//        int userId = (Integer) request.getAttribute("userId");
//        List<Category> categories = categoryService.fetchAllCategories(userId);
//        return new ResponseEntity<>(categories, HttpStatus.OK);
//    }
//
//    @GetMapping("/{categoryId}")
//    public ResponseEntity<Category> getCategoryById(HttpServletRequest request, @PathVariable Integer categoryId) {
//        int userId = (Integer) request.getAttribute("userId");
//        Category category = categoryService.fetchCategoryById(userId, categoryId);
//        return new ResponseEntity<>(category, HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<Category> addCategory(HttpServletRequest request, @RequestBody Map<String, Object> categoryMap) throws EtResourceNotFoundException {
//        int userId = (Integer) request.getAttribute("userId");
//        String title = (String) categoryMap.get("title");
//        String description = (String) categoryMap.get("description");
//        Category category = categoryService.addCategory(userId, title, description);
//        return new ResponseEntity<>(category, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{categoryId}")
//    public ResponseEntity<Map<String, Boolean>> updateCategory(HttpServletRequest request, @PathVariable Integer categoryId, @RequestBody Category category) throws EtResourceNotFoundException {
//        int userId = (Integer) request.getAttribute("userId");
//        categoryService.updateCategory(userId, categoryId, category);
//        Map<String, Boolean> map = new HashMap<>();
//        map.put("success", true);
//        return new ResponseEntity<>(map, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{categoryId}")
//    public ResponseEntity<Map<String, Boolean>> deleteTransaction(HttpServletRequest request, @PathVariable Integer categoryId) {
//        int userId = (Integer) request.getAttribute("userId");
//        categoryService.removeCategoryWithAllTransactions(userId, categoryId);
//        Map<String, Boolean> map = new HashMap<>();
//        map.put("success", true);
//        return new ResponseEntity<>(map, HttpStatus.OK);
//    }
}
