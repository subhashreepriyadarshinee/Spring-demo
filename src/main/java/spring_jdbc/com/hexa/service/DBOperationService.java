package spring_jdbc.com.hexa.service;

import spring_jdbc.com.hexa.dao.DBOperationDAO;

public class DBOperationService {
private DBOperationDAO dao;

public DBOperationDAO getDao() {
	return dao;
}

public void setDao(DBOperationDAO dao) {
	this.dao = dao;
}
public void insert(int empno,String ename,String job,long sal){
	int rslt=dao.insert(empno, ename, job, sal);
	if(rslt==1){
		System.out.println("Record inserted Successfully:::");
	}else{
		System.out.println("DIDn't get inserted::::");
	}
	
}
}
