public class Demo {
    public static void main(String[] args){
       Character player=new Character("Thorin I \"Oakenshield\"",
                RaceFactory.getRace(new DwarfFactory(), "Hill Dwarf"));
        player.setAtributes(Stats.generate());
        player.addRaceBonuses();
        player.printSheet();
        player.talk();

        System.out.println("\n");

        Character player2=new Character("Elf \"Poppy\"",
                RaceFactory.getRace(new HumenFactory(), "Human"));
        player2.setAtributes(Stats.generate());
        player2.addRaceBonuses();
        player2.printSheet();
        player2.talk();

    }
}
