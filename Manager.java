public class Manager {
    worker iworker;
    public Manager(worker iworker){
        this.iworker=iworker;
    }
    public void managework(){
       iworker.work();
    }
}
