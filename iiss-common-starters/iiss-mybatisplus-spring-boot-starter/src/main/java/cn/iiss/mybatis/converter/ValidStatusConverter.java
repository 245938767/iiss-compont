package cn.iiss.mybatis.converter;

import cn.iiss.commons.constants.ValidStatus;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes({ValidStatus.class})
@MappedJdbcTypes({JdbcType.BIGINT})
public class ValidStatusConverter extends BaseTypeHandler<ValidStatus> {
    public ValidStatusConverter() {
    }

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, ValidStatus validStatus, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            preparedStatement.setInt(i, validStatus.getCode());
        } else {
            preparedStatement.setObject(i, validStatus.getCode(), jdbcType.TYPE_CODE);
        }

    }

    public ValidStatus getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return (ValidStatus) ValidStatus.of(resultSet.getInt(s)).orElse(ValidStatus.INVALID);
    }

    public ValidStatus getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return (ValidStatus) ValidStatus.of(resultSet.getInt(i)).orElse(ValidStatus.INVALID);
    }

    public ValidStatus getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return (ValidStatus) ValidStatus.of(callableStatement.getInt(i)).orElse(ValidStatus.INVALID);
    }
}
