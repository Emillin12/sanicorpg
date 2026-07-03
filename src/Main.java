import Model.Arqueiro;
import Model.Guerreiro;
import Model.Mago;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Play -------");
        Mago mg = new Mago();
        System.out.println("--- MAGO ---");
        mg.Ataque();
        mg.HP();
        mg.defesa();
        mg.EXP();
        mg.ATAQUE();
        mg.LEVEL();
        mg.MP();


        Guerreiro guerra = new Guerreiro();
        System.out.println("--- GUERREIRO ---");
        guerra.Ataque();
        guerra.EXP();
        guerra.HP();
        guerra.defesa();
        guerra.MP();
        guerra.ATAQUE();
        guerra.DEFESA();
        guerra.LEVEL();


        Arqueiro arq = new Arqueiro();
        System.out.println("--- ARQUEIRO ---");
        arq.Ataque();
        arq.defesa();
        arq.EXP();
        arq.HP();
        arq.ATAQUE();
        arq.DEFESA();
        arq.LEVEL();
        arq.MP();

    }
}