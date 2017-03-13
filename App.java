public class App {
  public static void main(String[] args) {

    Animal doctorChaos = new Animal();
    doctorChaos.mName = "doctorChaos";
    doctorChaos.mAge = 10;
    doctorChaos.mGender = "male";
    doctorChaos.mSpecies = "cat";
    doctorChaos.mBreed = "pixie-bob";
    doctorChaos.mGoodWithKids = false;

    Animal scooter = new Animal();
    scooter.mName = "scooter";
    scooter.mAge = 4;
    scooter.mGender = "male";
    scooter.mSpecies = "dog";
    scooter.mBreed = "boxer";
    scooter.mGoodWithKids = false;

    Animal albert = new Animal();
    albert.mName = "albert";
    albert.mAge = 8;
    albert.mGender = "male";
    albert.mSpecies = "dog";
    albert.mBreed = "pit-bull";
    albert.mGoodWithKids = true;

    Animal[] allAnimals = {doctorChaos, scooter, albert};

    System.out.println("Animals available for adoption");

    for (Animal individualAnimal : allAnimals) {
      System.out.println("-------------------");
      System.out.println(individualAnimal.mName);
      System.out.println(individualAnimal.mAge);
      System.out.println(individualAnimal.mGender);
      System.out.println(individualAnimal.mSpecies);
      System.out.println(individualAnimal.mBreed);
      System.out.println(individualAnimal.mGoodWithKids);
    }
    System.out.println("--------------------");
    System.out.println("Here are the pets that do well inside:");

    for (Animal individualAnimal : allAnimals) {
      if (individualAnimal.insidePet()) {
        System.out.println("-------------------");
        System.out.println(individualAnimal.mName);
        System.out.println(individualAnimal.mAge);
        System.out.println(individualAnimal.mGender);
        System.out.println(individualAnimal.mSpecies);
        System.out.println(individualAnimal.mBreed);
        System.out.println(individualAnimal.mGoodWithKids);
      }
    }
  }
}
