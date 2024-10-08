package introse.group20.hms.core.entities;

import java.util.UUID;

public class Medicine {
    private UUID id;
    private String name;
    private int quantity;
    private int breakfast;
    private int lunch;
    private int dinner;
    private boolean beforeBreakfast;
    private boolean beforeLunch;
    private boolean beforeDinner;
    private UUID prescriptionId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public boolean isBeforeBreakfast() {
        return beforeBreakfast;
    }

    public void setBeforeBreakfast(boolean beforeBreakfast) {
        this.beforeBreakfast = beforeBreakfast;
    }

    public boolean isBeforeLunch() {
        return beforeLunch;
    }

    public void setBeforeLunch(boolean beforeLunch) {
        this.beforeLunch = beforeLunch;
    }

    public boolean isBeforeDinner() {
        return beforeDinner;
    }

    public void setBeforeDinner(boolean beforeDinner) {
        this.beforeDinner = beforeDinner;
    }

    public UUID getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(UUID prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
}
