package introse.group20.hms.infracstructure.models.enums;

public enum Role {
    ADMIN,
    DOCTOR,
    PATIENT,;


    @Override
    public String toString(){
        return switch (this.ordinal()) {
            case 0 -> "ADMIN";
            case 1 -> "DOCTOR";
            case 2 -> "PATIENT";
            default -> null;
        };
    }
}