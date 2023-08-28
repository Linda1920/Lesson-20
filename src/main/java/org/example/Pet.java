package org.example;

public class Pet{
    public String getName() {
        return name;
    }

    public String name;
    public String type;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Pet (String name, String type){
        this.name=name;
        this.type=type;
    }
 /*   @Override
    public String toString(){
        return "Pet {"+"name="+name+'\''+"type= "+type+'\''+'}';
    }*/
}
