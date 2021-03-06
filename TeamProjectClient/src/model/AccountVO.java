package model;

public class AccountVO {
    private String id;
    private String pw;
    private String nickname;
    private String birth;

    public AccountVO() {}
    public AccountVO(String id, String pw, String nickname, String birth) {
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
        this.birth = birth;
    }

    public boolean passwordCheck(String pw) {
        return (this.pw.equals(pw));
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "AccountVO [id=" + id + ", pw=" + pw + ", nickname=" + nickname + ", birth=" + birth + "]";
    }
}