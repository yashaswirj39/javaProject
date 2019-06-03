package geeksforgeeks.waystocreateobject;

public class CloneExample implements Cloneable {
    String name = "GeeksForGeeks";
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample clone = new CloneExample();

        CloneExample obje2 = (CloneExample) clone.clone();
        System.out.println(obje2.name);
    }
}