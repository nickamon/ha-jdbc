/*
 * HA-JDBC: High-Availability JDBC
 * Copyright (c) 2004-2008 Paul Ferraro
 * 
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by the 
 * Free Software Foundation; either version 2.1 of the License, or (at your 
 * option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License 
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, 
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * Contact: ferraro@users.sourceforge.net
 */
package net.sf.hajdbc.sql;

import java.sql.SQLException;

import javax.naming.Referenceable;

/**
 * @author Paul Ferraro
 * @param <Z> data source class
 */
public abstract class CommonDataSource<Z extends javax.sql.CommonDataSource> implements Referenceable, javax.sql.CommonDataSource
{
	private String cluster;
	private String config;

	private CommonDataSourceFactory<Z> factory;
	private volatile Z proxy;
	
	protected CommonDataSource(CommonDataSourceFactory<Z> factory)
	{
		this.factory = factory;
	}
	
	protected synchronized Z getProxy() throws SQLException
	{
		if (this.proxy == null)
		{
			this.proxy = this.factory.createProxy(this.cluster, this.config);
		}
		
		return this.proxy;
	}

	/**
	 * @return the cluster
	 */
	public String getCluster()
	{
		return this.cluster;
	}

	/**
	 * @param cluster the cluster to set
	 */
	public void setCluster(String cluster)
	{
		this.cluster = cluster;
	}

	/**
	 * @return the config
	 */
	public String getConfig()
	{
		return this.config;
	}

	/**
	 * @param config the config to set
	 */
	public void setConfig(String config)
	{
		this.config = config;
	}
}