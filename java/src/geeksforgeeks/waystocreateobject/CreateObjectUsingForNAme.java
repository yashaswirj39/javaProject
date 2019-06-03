package geeksforgeeks.waystocreateobject;

public class CreateObjectUsingForNAme {

    public void show(){
        System.out.println("m1");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        CreateObjectUsingForNAme obj =
                (CreateObjectUsingForNAme) Class.forName("geeksforgeeks.waystocreateobject.CreateObjectUsingForNAme").newInstance();
        obj.show();
    }
}