package javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryImpl;
import pojobeans.AccountService;
import pojobeans.AccountServiceImpl;

/**
 * Created by Minh Trí on 02/06/2017.
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        //inject dependency
        bean.setAccountRepository(accountDao());
        return bean;
    }

    @Bean
    public AccountRepository accountDao() {
        AccountRepositoryImpl bean = new AccountRepositoryImpl();
        return bean;
    }
}
