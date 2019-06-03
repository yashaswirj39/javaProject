package geeksforgeeks.SwapJavaObject;

public class Car {
    int model, no;

    public Car(int model, int no) {
        this.model = model;
        this.no = no;
    }

    void print()
    {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}

class Wrapper{
    Car c;

    public Wrapper(Car c) {
        this.c = c;
    }
}
class Main{
    public static void swap(Wrapper c1, Wrapper c2){
        Car temp = c1.c;
        c1.c = c2.c;
        c2.c = temp;
    }

    public static void main(String[] args) {
        Car c1 = new Car(1,1);
        Car c2 = new Car(2,2);
        Wrapper wrapper1 = new Wrapper(c1);
        Wrapper wrapper2 = new Wrapper(c2);
        swap(wrapper1,wrapper2);
        wrapper1.c.print();
        wrapper2.c.print();
    }
}