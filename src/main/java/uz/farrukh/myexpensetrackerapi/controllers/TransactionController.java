package uz.farrukh.myexpensetrackerapi.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories/{categoryId}/transactions")
public class TransactionController {

//    private final TransactionService transactionService;
//
//    @Autowired
//    public TransactionController(TransactionService transactionService) {
//        this.transactionService = transactionService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Transaction>> getAllTransactions(HttpServletRequest request, @PathVariable Integer categoryId) {
//        int userId = (Integer) request.getAttribute("userId");
//        List<Transaction> transactions = transactionService.fetchAllTransactions(userId, categoryId);
//        return new ResponseEntity<>(transactions, HttpStatus.OK);
//    }
//
//    @GetMapping("/{transactionId}")
//    public ResponseEntity<Transaction> getTransactionById(HttpServletRequest request, @PathVariable Integer categoryId, @PathVariable Integer transactionId) {
//        int userId = (Integer) request.getAttribute("userId");
//        Transaction transaction = transactionService.fetchTransactionById(userId, categoryId, transactionId);
//        return new ResponseEntity<>(transaction, HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<Transaction> addTransaction(HttpServletRequest request, @PathVariable Integer categoryId, @RequestBody Map<String, Object> transactionMap) {
//        int userId = (Integer) request.getAttribute("userId");
//        Double amount = ((Integer)transactionMap.get("amount")).doubleValue();
//        String note = (String) transactionMap.get("note");
//        Long transactionDate = (Long) transactionMap.get("transactionDate");
//        Transaction transaction = transactionService.addTransaction(userId, categoryId, amount, note, transactionDate);
//        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{transactionId}")
//    public ResponseEntity<Map<String, Boolean>> updateTransaction(HttpServletRequest request, @PathVariable Integer categoryId, @PathVariable Integer transactionId, @RequestBody Transaction transaction) throws EtResourceNotFoundException {
//        int userId = (Integer) request.getAttribute("userId");
//        transactionService.updateTransaction(userId, categoryId, transactionId, transaction);
//        Map<String, Boolean> map = new HashMap<>();
//        map.put("success", true);
//        return new ResponseEntity<>(map, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{transactionId}")
//    public ResponseEntity<Map<String, Boolean>> deleteTransaction(HttpServletRequest request, @PathVariable Integer categoryId, @PathVariable Integer transactionId) {
//        int userId = (Integer) request.getAttribute("userId");
//        transactionService.removeTransaction(userId, categoryId, transactionId);
//        Map<String, Boolean> map = new HashMap<>();
//        map.put("success", true);
//        return new ResponseEntity<>(map, HttpStatus.OK);
//    }
}
