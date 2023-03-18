package model;

public class Passenger {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "role=" + role +
                '}';
    }
}
