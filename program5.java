class A{
    public void methodA(){
        System.out.println("A");
    }
}
class B extends A{
    public void methodB() {
        System.out.println("B");
    }
}
class C extends B{
    public void methodC() {
        System.out.println("C");
    }
}