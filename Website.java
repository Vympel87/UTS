public class Website extends Account{
    private static int index=0;
    private static String[] usernames = new String[99];
    private static String[] passwords = new String[99];

    public Website(String username, String password){
        super(username,password);
        this.usernames[index]=username;
        this.passwords[index]=password;
        index++;
        System.out.println("Akun berhasil ditambahkan!");
    }
    public Account makeAccount(String username,String password){
        for(int i=0;i<index;i++){
            if(usernames[i].equals(username)){
                System.out.println("Mohon maaf username telah digunakan");
                return null;
            }

        }
        return new Website(username, password);
    }
    public void login(String username,String password){
        for(int i=0;i<index;i++){
            if (usernames[i].equals(username) && passwords[i].equals(password)){
                System.out.println("Login Berhasil!");
            }
            else{
                System.out.println("Akun tidak ditemukan");
            }
        }
    }

    private int encrypt(String password) {
        return (6*(-1)^index);
    }
}
