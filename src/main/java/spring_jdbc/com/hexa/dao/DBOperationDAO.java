package spring_jdbc.com.hexa.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationDAO implements DBOperations{
	public static final String INSERT_QUERY="insert into OPERATION(empno,ename,job,salary)values(?,?,?,?)";
    private JdbcTemplate jte;
    
	public JdbcTemplate getJte() {
		return jte;
	}



	public void setJte(JdbcTemplate jte) {
		this.jte = jte;
	}



	public int insert(int empno, String ename, String job, long sal) {
		// TODO Auto-generated method stub
		int rslt=jte.update(INSERT_QUERY, empno,ename,job,sal);
		return rslt;
	}
}
