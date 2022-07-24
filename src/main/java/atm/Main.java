package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(ATMConfig.class); //สร้างbean เพื่อไปเรียกmethodที่มีbean

        AtmUI atmUI = context.getBean(AtmUI.class);//ใช้สร้างobjectแทนการnew
        atmUI.run();
    }
}
