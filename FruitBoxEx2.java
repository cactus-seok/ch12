//import java.util.ArrayList;
//
//class Fruit implements Eatable { public String toString()  {return "Fruit";} }
//
//class Apple extends Fruit { public String toString()  {return "Apple";} }
//
//class Grape extends Fruit { public String toString()  {return "Grape";} }
//
//class Toy                 { public String toString()  {return "Toy"  ;} }
//
//interface Eatable{}
//
//class FruitBoxEx1 {
//    public static void main(String[] args) {
//        Box<Fruit> fruitBox = new Box<Fruit>();
//        Box<Apple> appleBox = new Box<Apple>();
//        Box<Grape> grapeBox = new Box<Grape>();
//        Box<Toy>   toyBox   = new Box<Toy>();
//
//        fruitBox.add(new Fruit());
//        fruitBox.add(new Apple());
//        appleBox.add(new Apple());
//        appleBox.add(new Apple());
//        grapeBox.add(new Grape());
//        grapeBox.add(new Grape());
//        toyBox.add(new Toy());
////        appleBox.add(new Grape());  //Grape는 apple의 자손이 아님.
//
//        System.out.println("fruitBox-"+fruitBox);
//        System.out.println("appleBox-"+appleBox);
//        System.out.println("toyBox-"+toyBox);
//        System.out.println("grapeBox-"+grapeBox);
//    }
//}
//
//class Box<T> {
//    ArrayList<T> list = new ArrayList<T>();
//    void add(T item)    { list.add(item);       }
//    T get(int i)        { return list.get(i);   }
//    int size()          { return list.size();   }
//    public String toString() { return list.toString(); }
//}
//
//class FritBox<T extends Fruit & Eatable> extends Box<T>{}