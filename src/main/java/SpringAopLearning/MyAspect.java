package SpringAopLearning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    //前置通知
    public void checkPri(JoinPoint joinPoint){
        System.out.println("Check priority=========="+joinPoint);
    }

    //后置通知
    public void writeLog(Object result){
        System.out.println("日志记录================"+result);
    }
    //环绕通知
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知==============");
        Object object=proceedingJoinPoint.proceed();
        System.out.println("环绕后通知==============");
        return object;
    }
    //异常抛出通知
    public void afterThrowing(Throwable tx){
        System.out.println("异常抛出通知"+tx.getMessage());
    }
    //最终通知
    public void after(){
        System.out.println("最终通知");
    }

}
