package uz.farrukh.myexpensetrackerapi.services.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.farrukh.myexpensetrackerapi.services.TransactionService;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

//    private final TransactionRepository transactionRepository;
//
//    @Autowired
//    public TransactionServiceImpl(TransactionRepository transactionRepository) {
//        this.transactionRepository = transactionRepository;
//    }
//
//
//    @Override
//    public List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId) {
//        return transactionRepository.findAll(userId, categoryId);
//    }
//
//    @Override
//    public Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
//        return transactionRepository.findById(userId, categoryId, transactionId);
//    }
//
//    @Override
//    public Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws ETBadRequestException, EtResourceNotFoundException {
//        int transactionId = transactionRepository.create(userId, categoryId, amount, note, transactionDate);
//        return transactionRepository.findById(userId, categoryId, transactionId);
//    }
//
//    @Override
//    public void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws ETBadRequestException {
//        transactionRepository.update(userId, categoryId, transactionId, transaction);
//    }
//
//    @Override
//    public void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
//        transactionRepository.removeById(userId, categoryId, transactionId);
//    }
}
