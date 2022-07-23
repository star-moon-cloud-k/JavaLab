package intermediate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class J65UsingClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Class classes = obj1.getClass();

        System.out.println(classes.getName());      //클래스 이름
        System.out.println("-------------constructor---------------");
        Constructor[] constructors = classes.getDeclaredConstructors();
        for (Constructor con : constructors) {
            System.out.println(con.getName());
        }

        System.out.println("------Method-------");
        Method[] method = classes.getMethods();
        for (Method me : method) {
            System.out.println(me.getName());
        }

    }
}
