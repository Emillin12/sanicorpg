package Model;

import Interface.Jogabilidade;

public class Guerreiro extends Personagens implements Jogabilidade {
    @Override
    public void Ataque() {
        System.out.println("Ataque dulpo ");
        System.out.println("Giro da morte");
        System.out.println("Skill 1:Arma de Duas Mãos");
        System.out.println("Skill 2:Ataque Giratório");
    }

    @Override
    public void defesa() {
        System.out.println("Fúria:A cada % de vida perdida ou acerto no inimigo, ele ganha pontos de Raiva para desferir golpes mais violentos ");

    }
}
