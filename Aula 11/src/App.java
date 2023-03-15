import enumerators.DinheiroEnum;

public class App {
    public static void main(String[] args) throws Exception {
        DinheiroEnum nota1 = DinheiroEnum.LOBO;
        System.out.println(nota1);
        System.out.println(nota1.getValue());
        System.out.println(nota1.getAnimal());
    }
}
