
public class HealthStation {
    private int countWeighings = 0;
    
    public int weigh(Person person) {
        countWeighings++;
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }

    public void feed(Person person) {
        int addWeigh = this.weigh(person);
        addWeigh+=1;
        person.setWeight(addWeigh);
    }
    public int weighings(){
        return countWeighings;
    }
}
