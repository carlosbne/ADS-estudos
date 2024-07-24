class Main{
    public static void main(String[] args) {
        Racional r1 = new Racional(2,3);
        Racional r2 = new Racional(5,7);
        Racional r3 = r1.somar(r2);
        System.out.println(r3);
    }
}
