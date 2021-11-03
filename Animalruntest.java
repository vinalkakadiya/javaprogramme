package Week14homework;

public class Animalruntest {

} class Horse extends AnimalPolymorphismOverrinding {
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
        AnimalPolymorphismOverrinding obj = new Horse();
        obj.sound();
    }
}