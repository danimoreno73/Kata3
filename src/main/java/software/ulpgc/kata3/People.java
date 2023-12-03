package software.ulpgc.kata3;

public class People {

    private final int index;
    private final String userid;
    private final String name;
    private final String surname;
    private final String sex;
    private final String email;
    private final String phone;
    private final String birthday;
    private final String title;

    public People(int index, String userid, String name, String surname, String sex, String email, String phone, String birthday, String title) {
        this.index = index;
        this.userid = userid;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.title = title;
    }

    public int getIndex() {
        return index;
    }

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "People{" +
                "index=" + index +
                ", userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
