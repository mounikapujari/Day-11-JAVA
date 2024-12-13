import java.util.*;
class Main{
  int s=0;
  void sum(int N){
    s+=N;
  }
  void remove(int N1){
    s-=N1;
 }
  public void display(){
    System.out.println("0.Mouse");
    System.out.println("1.keyboard");
   System.out.println("2.Monitors");
   System.out.println("3.cpu");
   System.out.println("4.Speakers");
   System.out.println("5.Mobile");
   System.out.println("6.Earphones");
   System.out.println("7.Laptop");
}
}
class Shoppingbill{
  public static void main(String args[]){
    Main obj=new Main();
    ArrayList<Integer> a= new ArrayList<>();
    a.add(150);
    a.add(200);
    a.add(20000);
    a.add(10000);
    a.add(500);
    a.add(18000);
    a.add(2000);
    a.add(50000);
    int b[]=new int[a.size()];
    for(int i=0;i<a.size();i++){
      b[i]=a.get(i);
    }
    obj.display();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a1[]=new int[n];
    for(int j=0;j<n;j++){
      a1[j]=sc.nextInt();
    }
    for(int j=0;j<n;j++){
      for(int i=0;i<a.size();i++){
        if(a1[j]==i){
          int N=b[i];
          obj.sum(N);
        }
      }
    }
    System.out.println(obj.s);
    int n2=sc.nextInt();
    int a2[]=new int[n2];
    for(int j=0;j<n2;j++){
      a2[j]=sc.nextInt();
    }
    for(int j=0;j<n2;j++){
      for(int i=0;i<a.size();i++){
        if(a2[j]==i){
          int N1=b[i];
          obj.remove(N1);
        }
      }
    }
    System.out.println(obj.s);
  }
}