package Data;

public class Member {


    private String username;
    private long password;
    


    public static Member[] member = new Member[10];
    public static Player[] player = new Player[3];


    public static int headM = 3;
    public static int headP;
    
    /**
     *
     * @param username
     * @param password
     * 
     */
    public Member(String username, long password) {
        this.username = username;
        this.password = password;
    }

    /**
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @return password
     */
    public long getPassword() {
        return password;
    }

}
