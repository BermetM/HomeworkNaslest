public class Main {
    public static void main(String[] args) {
        Persen persen = new Persen("Roma","Programmist");
        System.out.println(persen);

        Programmer program = new Programmer("Ten","Backend","Borland");
        System.out.println(program);

        Dancer dancer = new Dancer("Tatiana Terexova","Balerina",
                "Teatr Stanislavskogo");
        System.out.println(dancer);


        Singer singer = new Singer("Nikolai Baskov","Peves","Sol");
        System.out.println(singer);
    }

}