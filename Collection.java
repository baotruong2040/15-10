public class Collection {
    public static void main(String[] args) {
        Book b1 = new Book(333, "HelloWorld", "Akira", 2022);
        Magazine m1 = new Magazine(2, "ShonenJump", "Shueisha", 2022);
        
        System.out.println(b1.getDetail());
        System.out.println(m1.getDetail());
    }
}
