class Mom {
    void momMethod(){}
        }

class Son extends Mom{
    @Override
    void momMethod(){
        System.out.println("11");
    }
}
class AnnotationEx1 {
    public static void main(String[] args) {
        Son a = new Son();
        a.momMethod();
    }
}
