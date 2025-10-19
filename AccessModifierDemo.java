class Person {
    public String name = "Deepika";
    private int age = 21;
    protected String city = "chennai";
    String country = "India";
    public void displayPublic() {
        System.out.println("Public Method: Name = "+ name);
    }
    private void displayPrivate(){
        System.out.println("Private Method: Age = "+ age);
    }
    protected void displayProtected(){
        System.out.println("Protected Method: City = "+ city);
    }
    void displayDefault() {
        System.out.println("Default Method: Country = "+ country);
    }
    public void showPrivate() {
        displayPrivate();
    }
}
public class AccessModifierDemo {
    public static void main(String[] args){
        Person p = new Person();
        p.displayPublic();
        p.showPrivate();
        p.displayProtected();
        p.displayDefault();
    }
}