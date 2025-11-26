class SimpleStudent {
    String name;
    int age;
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        SimpleStudent s1 = new SimpleStudent();
        s1.name = "Alice";
        s1.age = 20;
        s1.display();
    }
}