class Animal {
  public String mName;
  public int mAge;
  public String mGender;
  public String mSpecies;
  public String mBreed;
  public boolean mGoodWithKids;

  public boolean insidePet() {
    if (mSpecies == "dog" && mGoodWithKids) {
      return true;
    } else {
      return false;
    }
  }
}
