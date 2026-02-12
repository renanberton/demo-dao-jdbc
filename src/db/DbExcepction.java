package db;

public class DbExcepction extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbExcepction(String msg) {
		super(msg);
	}
	
}
