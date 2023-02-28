package db;
public class DbException extends RuntimeException {
    
    //Criar uma exception herdando da RuntimeException

    public DbException (String msg){
        super(msg);
    }
    
}
