package Model;

import Interface.Jogabilidade;

public class Mago extends Personagens implements Jogabilidade {

    @Override
    public void Ataque() {
        System.out.println("Perda de 25 do HP");
        System.out.println("Roubo de 5% da defesa");
        System.out.println("Skill 1: Fusão Ativa-> Misturar dois feitiços básicos na hora");
        System.out.println("Skill 2: Parkour Mágico");

    }

    @Override
    public void defesa() {
        System.out.println("Barreira de proteção");

    }
}
