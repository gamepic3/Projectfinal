package Data;

public class Member {

    //Attribute
    private String username;
    private long password;
    

    //Array
    public static Member[] member = new Member[10];
    public static Player[] player = new Player[3];

    //Attribute
    public static int headM = 3;
    public static int headP;
    
    
    //Constucture
    public Member(String username, long password) {
        this.username = username;
        this.password = password;
    }

    //Getter
    public String getUsername() {
        return username;
    }

    public long getPassword() {
        return password;
    }

}
