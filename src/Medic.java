public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность Regeneration");
    }

    int healPoints;
    public void increaseExperience(){
        healPoints = healPoints + (healPoints/10);
    }


}
