package cn.iiss.security.exception;

import org.springframework.security.core.AuthenticationException;

public class UserForceLoginOutException extends AuthenticationException {
    public UserForceLoginOutException(String msg) {
        super(msg);
    }
}
