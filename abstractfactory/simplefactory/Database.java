package com.liuhongbo.designmode.abstractfactory.simplefactory;

public class Database {

	//�������ݿ�ʱ,ֻҪ�޸�����,���������Ӧ�����ݿ�ӿ�,����AccessIUser,MySQLIDepartment�ȵ�
	//������÷���������ļ�������Ҫ�޸ĳ����е��κβ���
	//Class.forName("���ݿ���+����")������Է�ֹ�������޸ģ����޸Ĺرգ�����չ����
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
