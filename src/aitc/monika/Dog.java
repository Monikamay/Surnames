package aitc.monika;

/**
 * Created by studenta on 10.04.2017.
 */
public class Dog extends Animal {
    boolean isBarking;
    private boolean isFriendly;
    private boolean isFemale;
    private boolean isMilkTeeth;


    public Dog (){

    }

    public Dog(boolean isMammal,
               String ownerName,
               boolean isHungry,
               boolean isBarking, //new field
               boolean isFriendly,
               boolean isFemale,
               boolean isMilkTeeth) { //new field


        super(isMammal, ownerName, isHungry);

        this.isBarking = isBarking;
        this.isFriendly = isFriendly;

        this.isFemale = isFemale;
        this.isMilkTeeth = isMilkTeeth;

    }

    public void setBarking(boolean barking) {
        isBarking = barking;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void examination() {

        if (getIsFemale()) {
            System.out.println("dog is a female");
        } else {
            System.out.println("dos is a male");
        }
    }

    private boolean getIsFemale() {
        return this.isFemale;
    }


    public boolean getisMilkTeeth() {

        if (getMilkteeth()) {
            System.out.println(" it has milkteeth");
        } else {
            System.out.println("it has not milkteeth");

        }
        return getMilkteeth();
    }

    private boolean getMilkteeth() {
        return this.isMilkTeeth;
    }


    @Override
    public void setHungry(String food) {
       super.setHungry(food);

    }
}

