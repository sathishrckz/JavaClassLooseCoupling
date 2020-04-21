public class Test {
    public static void main(String [] args){
        worker iworker = new Hardworker();
        worker iworker2 = new Lazyworker();
        worker iworker3 = new Superworker();

        Manager mw = new Manager(iworker);
        Manager mw2 = new Manager(iworker2);
        Manager mw3 = new Manager(iworker3);
        mw.managework();
        mw2.managework();
        mw3.managework();

    }
}
