package Lesson4.Homework;

public class Cats {
    String nickname;
    char sex;

    public Cats(String nickname, char sex) {
        this.nickname = nickname;
        this.sex = sex;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname = " + nickname +
                ", sex = " + sex +
                "}";
    }
}
