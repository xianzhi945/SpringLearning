package OtherAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("customerService")
@Scope("prototype")
public class CustomerService {

    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }
    public void save(){
        System.out.println("save方法执行");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }

}
