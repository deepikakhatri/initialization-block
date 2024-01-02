class A{
      {
        System.out.println("instance initialization block");
      }
    A(){
        System.out.println("constructor");
    }
    public static void main(String[] args){
        A x = new A();

        
    }
}