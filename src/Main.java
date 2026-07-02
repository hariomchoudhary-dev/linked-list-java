public class Main {
    public static void main(String[] args) {
    Ll list = new Ll();
    list.add(5);
    list.add(6);
    list.add(8);

    list.insert(6,7);
    list.deleteLast();
    list.display();
        System.out.println(list.size);
    }
}
