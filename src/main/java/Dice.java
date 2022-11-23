public class Dice {
    private static int dice = 6;
    private Integer numOfRolls;
    private Integer sum;

    public Dice(Integer numberOfRolls){
        this.numOfRolls = numberOfRolls;
    }

    public Integer addSum(){
        Integer sum = 0;
        for (int i =0; i < numOfRolls; i++){
            sum += (int) (Math.random() * dice) + 1;
        }
        return sum;
    }
}
