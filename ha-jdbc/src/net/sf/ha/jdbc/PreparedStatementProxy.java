package net.sf.ha.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

/**
 * @author Paul Ferraro
 * @version $Revision$
 */
public class PreparedStatementProxy extends StatementProxy implements PreparedStatement
{
	/**
	 * Constructs a new PreparedStatementProxy
	 * @param connection
	 * @param statementMap
	 */
	public PreparedStatementProxy(ConnectionProxy connection, Map statementMap)
	{
		super(connection, statementMap);
	}
	
	/**
	 * @see java.sql.PreparedStatement#executeUpdate()
	 */
	public int executeUpdate() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				return new Integer(statement.executeUpdate());
			}
		};
		
		return ((Integer) this.firstItem(this.executeWrite(operation))).intValue();
	}

	/**
	 * @see java.sql.PreparedStatement#addBatch()
	 */
	public void addBatch() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.addBatch();
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#clearParameters()
	 */
	public void clearParameters() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.clearParameters();
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#execute()
	 */
	public boolean execute() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				return new Boolean(statement.execute());
			}
		};
		
		return ((Boolean) this.firstItem(this.executeWrite(operation))).booleanValue();
	}

	/**
	 * @see java.sql.PreparedStatement#setByte(int, byte)
	 */
	public void setByte(final int index, final byte value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setByte(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setDouble(int, double)
	 */
	public void setDouble(final int index, final double value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setDouble(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setFloat(int, float)
	 */
	public void setFloat(final int index, final float value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setFloat(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setInt(int, int)
	 */
	public void setInt(final int index, final int value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setInt(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setNull(int, int)
	 */
	public void setNull(final int index, final int sqlType) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setNull(index, sqlType);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setLong(int, long)
	 */
	public void setLong(final int index, final long value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setLong(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setShort(int, short)
	 */
	public void setShort(final int index, final short value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setShort(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setBoolean(int, boolean)
	 */
	public void setBoolean(final int index, final boolean value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setBoolean(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setBytes(int, byte[])
	 */
	public void setBytes(final int index, final byte[] value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setBytes(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream, int)
	 */
	public void setAsciiStream(final int index, final InputStream inputStream, final int length) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setAsciiStream(index, inputStream, length);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream, int)
	 */
	public void setBinaryStream(final int index, final InputStream inputStream, final int length) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setBinaryStream(index, inputStream, length);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setUnicodeStream(int, java.io.InputStream, int)
	 * @deprecated
	 */
	public void setUnicodeStream(final int index, final InputStream inputStream, final int length) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setUnicodeStream(index, inputStream, length);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader, int)
	 */
	public void setCharacterStream(final int index, final Reader reader, final int length) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setCharacterStream(index, reader, length);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setObject(int, java.lang.Object)
	 */
	public void setObject(final int index, final Object value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setObject(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setObject(int, java.lang.Object, int)
	 */
	public void setObject(final int index, final Object value, final int sqlType) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setObject(index, value, sqlType);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setObject(int, java.lang.Object, int, int)
	 */
	public void setObject(final int index, final Object value, final int sqlType, final int scale) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setObject(index, value, sqlType, scale);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setNull(int, int, java.lang.String)
	 */
	public void setNull(final int index, final int sqlType, final String typeName) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setNull(index, sqlType, typeName);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setString(int, java.lang.String)
	 */
	public void setString(final int index, final String value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setString(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setBigDecimal(int, java.math.BigDecimal)
	 */
	public void setBigDecimal(final int index, final BigDecimal value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setBigDecimal(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setURL(int, java.net.URL)
	 */
	public void setURL(final int index, final URL value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setURL(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setArray(int, java.sql.Array)
	 */
	public void setArray(final int index, final Array value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setArray(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setBlob(int, java.sql.Blob)
	 */
	public void setBlob(final int index, final Blob value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setBlob(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setClob(int, java.sql.Clob)
	 */
	public void setClob(final int index, final Clob value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setClob(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setDate(int, java.sql.Date)
	 */
	public void setDate(final int index, final Date value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setDate(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#getParameterMetaData()
	 */
	public ParameterMetaData getParameterMetaData() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				return statement.getParameterMetaData();
			}
		};
		
		return (ParameterMetaData) this.executeRead(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setRef(int, java.sql.Ref)
	 */
	public void setRef(final int index, final Ref value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setRef(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#executeQuery()
	 */
	public ResultSet executeQuery() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				return statement.executeQuery();
			}
		};

		return (this.getResultSetConcurrency() == ResultSet.CONCUR_READ_ONLY) ? (ResultSet) this.executeRead(operation) : new ResultSetProxy(this, this.executeWrite(operation));
	}

	/**
	 * @see java.sql.PreparedStatement#getMetaData()
	 */
	public ResultSetMetaData getMetaData() throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				return statement.getMetaData();
			}
		};
		
		return (ResultSetMetaData) this.executeRead(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setTime(int, java.sql.Time)
	 */
	public void setTime(final int index, final Time value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setTime(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setTimestamp(int, java.sql.Timestamp)
	 */
	public void setTimestamp(final int index, final Timestamp value) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setTimestamp(index, value);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setDate(int, java.sql.Date, java.util.Calendar)
	 */
	public void setDate(final int index, final Date value, final Calendar calendar) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setDate(index, value, calendar);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setTime(int, java.sql.Time, java.util.Calendar)
	 */
	public void setTime(final int index, final Time value, final Calendar calendar) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setTime(index, value, calendar);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}

	/**
	 * @see java.sql.PreparedStatement#setTimestamp(int, java.sql.Timestamp, java.util.Calendar)
	 */
	public void setTimestamp(final int index, final Timestamp value, final Calendar calendar) throws SQLException
	{
		PreparedStatementOperation operation = new PreparedStatementOperation()
		{
			public Object execute(PreparedStatement statement) throws SQLException
			{
				statement.setTimestamp(index, value, calendar);
				
				return null;
			}
		};
		
		this.executeSet(operation);
	}
}
