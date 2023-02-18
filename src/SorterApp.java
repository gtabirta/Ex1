import sorter.Sorter;
public class SorterApp {
    public static void main(String[] args) {
        Sorter sorter = new Sorter ();
        sorter.setNum(1);
        sorter.setMinNum(99);
        sorter.setMaxNum(1001);
        sorter.increment(1000);

        //System.out.println(sorter.getNum());
        System.out.println( "Numere din intervalul 100 - 1000 care se impart la 5:");
        System.out.println(sorter.getCollFive());
        //System.out.println (sorter.getCollFive1 ());
        //System.out.println (sorter.collFiveArr[5][5]);
        //System.out.println( " ");
        System.out.println( "Numere din intervalul 100 - 1000 care se impart la 6:");
        System.out.print(sorter.getCollSix());
        }
}