import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class DoBeforeMethod implements MethodBeforeAdvice
{
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.print("Hola ");
    }
}