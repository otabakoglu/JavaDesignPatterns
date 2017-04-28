package  Strategy;


public abstract class Printer {

    private String type;
    private Fax fax;

    public void fax(){
        getFax().fax();
    }

    public  void setFax(Fax fax){
        this.fax = fax;
    }
    public Fax getFax(){
        return fax;
    }

    public Printer() {
    }

    public Printer(String type) {
        this.type = type;
    }
    public void print(){
        System.out.print("printed with: " + getType());
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}
