// Trix Uke 3: 03.04: Arv av egenskaper

public class ArvAvEgenskaper{

    public static void main(String []args){

       A a = new B();
       B b = new B();
       a.hvemErJeg();
       b.hvemErJeg();
    }
}

class A{
   public void hvemErJeg(){
       System.out.println("A");
   }
}

class B extends A{
    /*
   @Override
   public void hvemErJeg(){
       System.out.println("B");
   }*/
}
