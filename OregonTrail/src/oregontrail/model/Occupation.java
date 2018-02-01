
package oregontrail.model;

import java.util.Objects;

/**
 *
 * @author Coby, Spencer, Angie
 */
public enum Occupation {
    
    Banker("Banker","You are a wealthy owner of a local bank and start off with extra cash, but it is harder for you to survive the trail because you didn't live in the country."),
    Farmer("Farmer","You are a poor farmer from the country. You don't have much money, but you can survive the trail easier because you have lived off the land."),
    Blacksmith("Blacksmith","You are a blacksmith that has worked with metal your whole life. Your money is average, you reinforce your wagon parts with metal so they last longer."),
    Carpenter("Carpenter","You are a carpenter that has earned enough to get by. You are very good with wood, however, and have a much better chance of repairing your wagon."),
    Doctor("Doctor","You are a rich doctor who knows a lot in the field of medicine and first aid. Your party members are less likely to die from sickness or injury."),
    Bandit("Bandit","You are a thief by nature. You know how to pickpocket a guy with no pockets. You don't know much else, but any time you're in a town, you magically get extra goods. How convenient!"),
    Trapper("Trapper","You are a master trapper. You know the ins and outs of every animal in the wild. Although you never made much money, you always fed your family. Whenever you hunt, you always bring something back, and you can bring back up to double the amount of normal pioneers.");
    
    //class instance variables
    private String name;
    private String description;

    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }

    Occupation(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Occupation{" + "name=" + name + ", description=" + description + '}';
    }
   
}
