class Parent{
    int a = 20;
    void display() {
    System.out.println("Parent");

    }
    }
    class Inherit{
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            C obj = new C();
            System.out.println(obj.b);
            obj.show();
            
                System.out.println(obj.a);
            obj.display();
        }
       }

       class C extends Parent{
        int b =10;
        void show() {
        System.out.println("child");
    

}
}
