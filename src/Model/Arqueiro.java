package Model;

import Interface.Jogabilidade;

public class Arqueiro extends Personagens implements Jogabilidade {

    @Override
    public void Ataque() {
        System.out.println("Flechas de Fogo");
        System.out.println("Tensão da Corda e Fadiga");
        System.out.println("Skill 1:Tiro Múltiplo");
        System.out.println("Skill 2:Visão de Águia / Concentração");
    }

    @Override
    public void defesa() {
        System.out.println("Esquiva e Rolamento");

    }
}
