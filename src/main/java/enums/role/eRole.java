package enums.role;

public enum eRole {
    OWNER,
    ADMIN,
    USER;

    public static eRole getRole(String role) {
        for (eRole value : eRole.values()) {
            if (value.name().equals(role)) {
                return value;
            }
        }
        return null;
    }
}
