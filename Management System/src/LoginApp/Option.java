package LoginApp;

public enum Option {
    Admin,student;

    private Option(){}

    public String value(){
        return name();
    }
    public static Option fromvalue(String v){
        return valueOf(v);
    }
}
