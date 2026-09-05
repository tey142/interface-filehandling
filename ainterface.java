interface myinterface{
    //compiler will treat these as abstract methods
    void method1();
    void method2();
}
class ainterface implements myinterface{
    public void method1(){
        System.out.println("implement method1");
    }
    public void method2(){
        System.out.println("implement method2");
    }
    public static void main(String[] args){
    myinterface o=new ainterface();
    o.method1();
    o.method2();
    }
}