import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

    @Test
    public void classReflection() {
        ReflectiveClass aClass = new ReflectiveClass(2, "3");
        Method[] allMethods = aClass.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println(method);
        }
        System.out.println("-");
    }

    @Test
    public void interfaceReflection() {
        ReflectiveInterface aClass = new ReflectiveClass(2, "3");
        Method[] allMethods = aClass.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println(method);
        }
        System.out.println("-");
    }

    @Test
    public void publicOnlyReflection() {
        ReflectiveClass aClass = new ReflectiveClass(2, "3");
        Method[] allMethods = aClass.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println(method);
            }
        }
        System.out.println("-");
    }
}
