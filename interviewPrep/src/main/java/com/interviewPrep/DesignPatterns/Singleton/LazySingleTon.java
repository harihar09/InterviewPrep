package com.interviewPrep.DesignPatterns.Singleton;

import org.springframework.core.serializer.Deserializer;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class LazySingleTon extends MyClone implements Serializable {
    private static LazySingleTon instance;

    private LazySingleTon() {
        // avoid creating instance if it's already created
        // for reflection
        if (instance != null) {
            throw new IllegalStateException("can't create instance via reflection");
        }
    }

    public static LazySingleTon getInstance() {
        if (instance == null)
            instance = new LazySingleTon();
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        LazySingleTon obj1 = LazySingleTon.getInstance();
        System.out.println(obj1.hashCode());
        LazySingleTon obj2 = LazySingleTon.getInstance();
        System.out.println(obj2.hashCode());
        // cloning obj
        //  Object clonedObj = obj2.clone();
        // System.out.println(clonedObj.hashCode());
        // create new object via reflection
        // get the private constructor and setAccessible to true
        // and create new instance
        /*LazySingleTon reflectionInstance = null;
        Constructor<LazySingleTon> constructor = LazySingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        reflectionInstance = constructor.newInstance();
        System.out.println(reflectionInstance.hashCode());*/

        // serialize the obj
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialize.ser"));
        out.writeObject(obj1);
        out.close();
        //deserialize obj
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialize.ser"));
        LazySingleTon deserializedObj = (LazySingleTon) in.readObject();
        System.out.println(deserializedObj.hashCode());
        in.close();

    }
}
