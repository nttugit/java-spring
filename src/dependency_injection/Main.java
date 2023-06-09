package dependency_injection;

public class Main {
    public static void main(String[] args) {
        // Ta sử dụng database đã config qua Container (FactoryDAO)
        // nên không cần khai báo ở đây, sử dụng thôi
        Client myCliennt = new Client();
        myCliennt.execute();
    }
}
