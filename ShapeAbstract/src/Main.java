import java.util.*;

public class Main {
    public static void main(String[] args) {
        Circle kolo1 = new Circle(4.0, "pink",true);
        Circle kolo2 = new Circle(4.0);
        Rectangle prostokat1 = new Rectangle(5.0, 10.0, "grey", false);
        Square kwadrat1 = new Square(4.0);

        int i=0;
        String[] kolory = {"pink", "red", "green", "yellow"};
        while(i<40){
            Random losowa = new Random();
            int los1 = losowa.nextInt(99);
            int los2 = losowa.nextInt(4);
            Circle kolo= new Circle(los1, kolory[los2] , Math.random() < 0.5);
            System.out.println(kolo);
            i++;
        }



        System.out.println("\n-----------------------------");

        ArrayList<Shape> listaFigur1 = new ArrayList<>();
        listaFigur1.add(kolo1);
        listaFigur1.add(kolo2);
        listaFigur1.add(kolo2);
        listaFigur1.add(kolo1);

        System.out.println(listaFigur1.get(3));
        listaFigur1.remove(3);
        System.out.println(listaFigur1);
        System.out.println(listaFigur1.indexOf(kolo1));
        listaFigur1.clear();
        System.out.println(listaFigur1.contains(kolo1));

        LinkedList<Circle> listaKol = new LinkedList<>();
        listaKol.add(kolo1);
        listaKol.add(kolo2);
        listaKol.add(kolo1);
        System.out.println("\n"+ listaKol);
        listaKol.addFirst(kolo2);
        System.out.println(listaKol);
        listaKol.add(new Circle(10));
        System.out.println(listaKol);
        System.out.println(listaKol.get(listaKol.size()-1));

        Set<Circle> zbiorKol = new HashSet<>();
        zbiorKol.add(kolo1);
        zbiorKol.add(kolo1);
        zbiorKol.add(kolo2);
        zbiorKol.add(kolo2);
        System.out.println("\n"+zbiorKol);

        Map<String,Circle> mapaKol = new HashMap<>();
        mapaKol.put("Koło1",kolo1);
        mapaKol.put("Koło2",kolo2);
        mapaKol.put("Koło1",kolo1);
        System.out.println(mapaKol);

        Map<Double,Circle> mapaKol2= new HashMap<>();
        mapaKol2.put(kolo1.getArea(),kolo1);
        mapaKol2.put(kolo2.getArea(),kolo2);
        mapaKol2.put(kolo2.getArea(),kolo1);
        System.out.println(mapaKol2);
        System.out.println(mapaKol2.keySet());

        Random losowa = new Random();
        System.out.println(losowa.nextInt(10));
    }
}
