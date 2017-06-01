package pojobeans;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Minh Tri on 06/01/17.
 */
public class AccountRepositoryImpl implements AccountRepository{
    private Map<Long,Account> accountMap = new HashMap<Long, Account>();
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);

        accountMap.put(account1.getId(),account1);
        accountMap.put(account2.getId(),account2);
    }


    public void insert(Account account) {
    accountMap.put(account.getId(),account);
    }

    public void update(Account account) {
    accountMap.put(account.getId(),account);
    }

    public Account find(long accountId) {
        return accountMap.get(accountId);
    }
}
