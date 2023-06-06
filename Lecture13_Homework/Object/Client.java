package Lecture13_Homework.Object;

import java.util.Objects;

public record Client(String userName, String birthday) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(userName, client.userName) && Objects.equals(birthday, client.birthday);
    }

}
