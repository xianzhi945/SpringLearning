package SpringAOPAnno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    //前置通知
    @Before(value = "MyAspect.pointCut1()")
    public void checkPri(JoinPoint joinPoint){
        System.out.println("Check priority=========="+joinPoint);
    }

    //后置通知
    @AfterReturning (value = "MyAspect.pointCut2()",returning = "result")
    public void writeLog(Object result){
        System.out.println("日志记录================"+result);
    }

    //环绕通知
    @Around(value = "MyAspect.pointCut3()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知==============");
        Object object=proceedingJoinPoint.proceed();
        System.out.println("环绕后通知==============");
        return object;
    }

    //异常抛出通知
    @AfterThrowing(value = "MyAspect.pointCut4()",throwing = "tx")
    public void afterThrowing(Throwable tx){
        System.out.println("异常抛出通知"+tx.getMessage());
    }
    //最终通知
    @After(value = "MyAspect.pointCut4()")
    public void after(){
        System.out.println("最终通知");
    }
    @Pointcut(value = "execution(* SpringAOPAnno.OrderDao.save(..))")
    private void pointCut1(){};
    @Pointcut(value = "execution(* SpringAOPAnno.OrderDao.delete(..))")
    private void pointCut2(){};
    @Pointcut(value = "execution(* SpringAOPAnno.OrderDao.update(..))")
    private void pointCut3(){};
    @Pointcut(value = "execution(* SpringAOPAnno.OrderDao.find(..))")
    private void pointCut4(){};

}
