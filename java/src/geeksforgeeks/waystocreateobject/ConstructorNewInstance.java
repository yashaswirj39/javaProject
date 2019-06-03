package geeksforgeeks.waystocreateobject;

import java.lang.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorNewInstance {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ConstructorNewInstance> constructor = ConstructorNewInstance.class.getDeclaredConstructor();
        ConstructorNewInstance c = constructor.newInstance();
        c.setName("Yash");
        System.out.println(c.name);
    }
}