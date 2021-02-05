package com.blog.yeonji;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;

//Configure 클래스를 상속받았으므로 따로 컨테이너 설정을 하지 않아도 됨

public class DBTest extends Configure {
	
	@Test
	public void dbConnect() throws Exception {
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		Connection conn = (Connection) dataSource.getConnection();
		System.out.println("성공 : " + conn);
	}
}