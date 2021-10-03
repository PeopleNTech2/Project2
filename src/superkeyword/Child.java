package superkeyword;

public class Child extends Father{

    //super keyword in constructor
    public Child(){
        super(20);
    }

    //super keyword in method
    public void higherEducation(){
        super.educated();
    }

    //super keyword in variables
    public void athleticSkills(){
        int numberOfSport = super.numberOfSport;
        System.out.println("he is practicing "+numberOfSport+" sports");
    }


}
