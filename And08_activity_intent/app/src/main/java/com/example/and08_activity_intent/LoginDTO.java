package com.example.and08_activity_intent;

import java.io.Serializable;

//직렬화
//다른 플랫폼이나 통신을 통해 객체가 보내져야할때(송신) 객체가 가진 모든 데이터의 참조 번지수를 공유하는것은 매우 불필요함
//객체가 가진 데이터부분을 바이트형태로 일자로 쭉 정리를 해서 데이터부분만 전송함
//다른 플랫폼에서는 메소드는 필요없고 , 필드의 데이터만 필요함
//여러가지 타입을 전송하기 위한 방법.
//loginDTO,serializable
public class LoginDTO implements Serializable {//직렬화!
    private String loginId, loginPw;

    public LoginDTO(String loginId, String loginPw) {
        this.loginId = loginId;
        this.loginPw = loginPw;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPw() {
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }
}
