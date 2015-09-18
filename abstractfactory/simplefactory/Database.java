package com.liuhongbo.designmode.abstractfactory.simplefactory;

public class Database {

	//更换数据库时,只要修改这里,并且填加相应的数据库接口,比如AccessIUser,MySQLIDepartment等等
	//如果利用反射和配置文件，则不需要修改程序中的任何部分
	//Class.forName("数据库名+表名")，则可以防止在类中修改，对修改关闭，对扩展开放
	private final static String Databasename = "MySQL";

	public static IUser createIUser() {
		IUser result = null;
		if (Databasename.equals("MySQL")) {
			result = new MySQLIUser();
		} else if (Databasename.equals("Access")) {
			result = new AccessIUser();
		}
		return result;
	}

	public static IDepartment createIDepartment() {
		IDepartment result = null;
		if (Databasename.equals("MySQL")) {
			result = new MySQLIDepartment();
		} else if (Databasename.equals("Access")) {
			result = new AccessIDepartment();
		}
		return result;
	}
}
