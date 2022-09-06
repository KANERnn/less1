public class Main {
    public static void main(String[] args) {

        Babyk babyk = new Babyk("face");
        Father father = new Father("Erbol", 18, colorEnum.BLACK, babyk);
        System.out.println(father.getInfo());
        father.lega("Welcome");
        father.makeHit();
        System.out.println("-_-_-_-_-_-_-");


        Babyk babyk1 = new Babyk("Beige");
        Son son = new Son("Xan", 12, colorEnum.BLACK, babyk);
        System.out.println(son.getInfo());
        father.lega("This is Ilon Mask");


    }
}