abstract interface math{
   void print();
}
class a implements math{
   public void print(){
       System.out.println("Hello");
   }
}
class AbstractInterface{
   public static void main(String[] args) {
       a f=new a();
       f.print();
   }
}

