//GArbage Collection'
public class q5{
    public static void main(String[] args) {
        Test t = new Test();
        t = null;
        System.gc();
    }
}

class Test{
    @Override
    public void finalize(){
        System.out.println("Object Deleted");
    }
}