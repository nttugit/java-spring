package dependency_injection;

public class Client {
    private IAbstractDAO dao;
    // Constructor Injection (Inject Bean lúc khởi tạo)
    public Client(){
        dao = FactoryDAO.getDAO();
    }

    public IAbstractDAO getDAO(){
        return dao;
    }

    public void setDAO(IAbstractDAO dao){
        this.dao = dao;
    }

    public void execute(){
        dao.insert();
        dao.update();
        dao.delete();
    }
}
