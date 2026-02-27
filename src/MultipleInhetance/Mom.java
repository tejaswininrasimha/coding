package MultipleInhetance;
interface Mom {
    default void cook(){
        System.out.println("iNDIAN");
    }
}
interface Dad {
    default void cook(){
        System.out.println("Chineese");
    }
}
class Child implements Mom,Dad{
    public void cook(){
        Dad.super.cook();
        Mom.super.cook();
    }
}
class Driver{
    public static void main(String[] args){
        Child c= new Child();
        c.cook();
    }
}