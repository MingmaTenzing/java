class OuterClass {

    int x = 10;
    
    class Innerclass {
        int y = 5; 
    }

}




public class Java_Inner_Class {

    public static void main(String[] args) {
        

        OuterClass myobj = new OuterClass();

        OuterClass.Innerclass myInner = myobj.new Innerclass();
        System.out.println(myInner.y + myobj.x);
    }
    
}
