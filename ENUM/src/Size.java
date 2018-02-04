public enum Size {
    SMALL("Mały"), MEDIUM("ŚREDNI"), LARGE("DUŻY");
    private String description;

    Size(String desc) {
        description = desc;
    }

    public String getDescription() {
        return description;
    }
}
