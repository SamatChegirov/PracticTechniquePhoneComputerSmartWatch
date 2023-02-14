public class Main {
    public static void main(String[] args) {

        Technique phone1 = new Phone("Smartphone ", "RedMi ", "Note 9 ", 84);
        Technique phone2 = new Phone("Smartphone ", "Samsung ", "Note 8 ", 0);

        Technique computer1 = new Computer("Notebook ", "Acer ", "Swift 4 ", 90);
        Technique computer2 = new Computer("Notebook ", "Asus ", "Rog ", 0);

        Technique smartwatch1 = new SmartWatch("SmartWatch ", "Samsung ", "Watch 8 ", 80);
        Technique smartwatch2 = new SmartWatch("SmartWatch ", "Apple ", "Watch 12 ", 0);

        Technique[] tech1 = new Technique[]{phone1, computer1, smartwatch1,};
        for (Technique t : tech1) {
            System.out.println(t + " " + t.turnOn());
        }
        System.out.println(" ");
        Technique[] tech2 = new Technique[]{phone2, computer2, smartwatch2};
        for (Technique h : tech2) {
            System.out.println(h + " " + h.turnOf());
        }


    }
}