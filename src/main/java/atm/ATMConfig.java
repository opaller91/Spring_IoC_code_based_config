package atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //บอกspring frameworkว่าเป็นconfig file
public class ATMConfig {
    //beanใช้กับclassที่เราจะnewแต่ไม่newเองให้bean newให้
    @Bean //method ที่มี@Beanต้องการให้springเรียกmethodนี้ตอนสร้าง เพื่อให้ bean newให้
    public DataSource dataSource() {
        return new DataSourceDB();
    }
    @Bean
    public Bank bank() {
        return new Bank("My Bank", dataSource());
    }

    @Bean
    public ATM atm() {
        return new ATM(bank());
    }

    @Bean
    public AtmUI atmUI() {
        return new AtmUI(atm());
    }
}
