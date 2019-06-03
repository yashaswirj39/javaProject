package geeksforgeeks.waystocreateobject;

import java.io.*;

public class Deserialization implements Serializable {
    private String name;

    public Deserialization(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Deserialization d= new Deserialization("yash");
        FileOutputStream f = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(f);
        oos.writeObject(d);
        oos.close();
        f.close();


        Deserialization ds;
        FileInputStream file=new FileInputStream("file.txt");
        ObjectInputStream oosread = new ObjectInputStream(file);
        d = (Deserialization) oosread.readObject();
        System.out.println(d.name);
    }
}
