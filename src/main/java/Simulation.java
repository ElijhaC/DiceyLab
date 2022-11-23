public class Simulation {
    private Integer numberOfDies;

    private Integer numberOfTosses;
    private Dice dice;
    private Bins bins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDies);
        this.bins = new Bins(numberOfDies);
    }

    public void runSimulation () {

        int tossValue = 0;
        for (Integer i = 0; i < numberOfTosses; i++) {
            tossValue = this.dice.addSum();
            this.bins.incrementBin(tossValue);
        }

    }
    public void printResults() {


        //int binSize = this.bins.;
        int numberOfBins = this.numberOfDies*6;
        Integer binValue = 0;
        float percentofToss = 0;
        Integer numberOfStars = 0;
        StringBuffer sb ;

        System.out.println("Simulation of " + this.numberOfDies + " dice tossed for "+ this.numberOfTosses +" times.\n");

        for (Integer i = this.numberOfDies; i <= numberOfBins; i++) {
            sb = new StringBuffer("");
            binValue = this.bins.getBin(i);
            percentofToss = (float)binValue/ (float) this.numberOfTosses;
            numberOfStars = (int) Math.round (binValue/10000);
            sb.append(String.format("%2d",i));
            sb.append(String.format(" %6d", binValue ));
            sb.append(String.format(" %6.2f", percentofToss ));
            sb.append(" ");
            for (int j=0; j< numberOfStars; j++){
                sb.append("*");
            }
            sb.append("\n");
            System.out.println(sb.toString());

        }

    }
    public static void main (String args[]) {
        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        sim.printResults();
    }

}
