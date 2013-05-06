package com.osgo.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport
{
		// this method gets the total number of records in the circle table
		public int getCircleCount()
		{
			String sql = "SELECT COUNT(*) FROM circle";
			// jdbcTemplate.setDataSource(getDataSource());
			return this.getJdbcTemplate().queryForInt(sql);
		} // end method getCircleCount
		
} // end Class SimpleJdbcDaoImpl
