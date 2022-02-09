//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ua.lviv.springlearn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Init method");
    }

    @PreDestroy
    public  void doMyDestroy(){
        System.out.println("Destroy method");
    }
    @Override
    public String getSong() {
        return "Classic song";
    }
}
