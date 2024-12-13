interface Out{
    void outm();
    interface in{
        void innm();
    }
}
class NestedInterface implements Out.in{
    public void innm(){
        System.out.println("Hello i'm inner method");
    }
    public static void main(String[] args){
        NestedInterface h=new NestedInterface();
        h.innm();
    }
}