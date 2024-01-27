

package cn.iiss.mybatis.converter;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes({Instant.class})
@MappedJdbcTypes({JdbcType.BIGINT})
public class InstantLongConverter extends BaseTypeHandler<Instant> {
    public InstantLongConverter() {
    }

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Instant instant, JdbcType jdbcType) throws SQLException {
        preparedStatement.setLong(i, instant.getEpochSecond());
    }

    public Instant getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return Instant.ofEpochSecond(resultSet.getLong(s));
    }

    public Instant getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return Instant.ofEpochSecond(resultSet.getLong(i));
    }

    public Instant getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return Instant.ofEpochSecond(callableStatement.getLong(i));
    }
}
