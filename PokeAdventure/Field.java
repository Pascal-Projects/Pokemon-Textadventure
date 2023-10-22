package PokeAdventure;

public class Field {
    private Pokemon[] pokemonList;

    private void printState() {
        System.out.println("You look around and see: ");
        for (Pokemon pokemon : pokemonList) {
            System.out.println(pokemon.getName());
        }
    }

    public Field generateField() {
        return new Field();
    }
}
