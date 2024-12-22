package solutions.encapsulationChallenge;

public class Printer {
    private int tonerLavel;
    private int pagesPrinted;
    private boolean duplex = false;

    public Printer(int tonerLavel, boolean duplex) {
        this.tonerLavel = tonerLavel;
        this.duplex = duplex;
    }



    public int addTonerAmount(int tonerAmount){
        if(tonerAmount > 100 || tonerAmount < 0) return  -1;
        this.tonerLavel = tonerAmount;
        return this.tonerLavel;
    }

    public int printPages(int pages){
        if(this.duplex){

            //double noOfSheets = Math.ceil((double) pages * 1.0/2);
            int jobPages = duplex? pages/2 + pages % 2: pages/2;
            this.pagesPrinted += jobPages;

            System.out.println("it's a duplex printer");
            return jobPages;
        }

        return this.pagesPrinted;
    }
}
