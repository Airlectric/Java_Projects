package OOPpractice_Pets;

public abstract class Pet {
    protected String name;
    protected String ownerName;

    Pet(String name, String ownerName){
        this.name = name;
        this.ownerName = ownerName;
    }

    public abstract String getName();

    public abstract String getOwnerName();

}

class Cat extends Pet{
    private int numberOfTeeth;
    private int lengthOfTail;

    Cat (String name, String ownerName, int numberOfTeeth, int lengthOfTail){
        super(name, ownerName);
        this.numberOfTeeth = numberOfTeeth;
        this.lengthOfTail = lengthOfTail;
    }

    @Override
    public String getName(){
        return super.name;
    }

    @Override
    public String getOwnerName(){
        return super.ownerName;
    }

    public int getNumberOfTeeth(){
        return numberOfTeeth;

    }

    public int getLengthOfTail(){
        return lengthOfTail;
    }

}


class Budgie extends Pet{

    private String colorOfFeathers;

    Budgie(String name, String ownerName, String colorOfFeathers){
        super(name,ownerName);
        this.colorOfFeathers = colorOfFeathers;
    }

    @Override
    public String getName() {
       return super.name;
    }

    @Override
    public String getOwnerName(){
        return super.ownerName;
    }

    public String getColorOfFeathers(){
        return colorOfFeathers;
    }
        

} 


class Test {
    public static void main(String[] args){
        Pet pets[] = {
         new Cat("J","Jane",5,8),
         new Cat("L","Lane",5,5),
         new Cat("K","Kane",5,3),
         new Budgie("Ji","Jine","yellow"),
         new Budgie("Pi","Pine","Blue")
        };

        printDetails(pets);

    }

    public static void printDetails(Pet pets[]){
        for(int i = 0; i < pets.length; i++){
            if (pets[i] instanceof Cat cat){
                pets[i] = cat;
                System.out.println(cat.getLengthOfTail());
            }

            else if(pets[i] instanceof Budgie budgie){
                pets[i] = budgie;
                System.out.println(budgie.getColorOfFeathers());

            }
            
        }

    } 
}