package com.personal.setznagl.Collections.Queue;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
        User(String nameParameter) {
            this.name = nameParameter;
        }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        return getName().equals(user.getName());
    }
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
