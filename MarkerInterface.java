interface printable{
}
class h implements printable{
    public void print(){
        System.out.println("Hello students");
    }
}public class MarkerInterface{
    public static void main(String[] args) {
        h f=new h();
        f.print();
    }
}