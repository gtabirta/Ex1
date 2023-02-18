import sorter.Sorter;
public class SorterApp {
    public static void main(String[] args) {
        Sorter sorter = new Sorter ();
        sorter.setNum(1);
        sorter.setMinNum(99);
        sorter.setMaxNum(1001);
        sorter.increment(1000);

        //System.out.println(sorter.getNum());
        System.out.println(sorter.getCollFive());
        System.out.print(sorter.getCollSix());
        }
}