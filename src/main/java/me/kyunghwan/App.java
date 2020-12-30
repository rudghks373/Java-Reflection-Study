package me.kyunghwan;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> booClass = Class.forName("me.kyunghwan.Book");
        Constructor<?> constructor = booClass.getConstructor(String.class);
        Book book = (Book) constructor.newInstance("myBook");
        System.out.println(book);

        Method sum = Book.class.getDeclaredMethod("sum" , int.class, int.class);
        int invoke = (int) sum.invoke(book,1,3);
        System.out.println(invoke);


    }
}
