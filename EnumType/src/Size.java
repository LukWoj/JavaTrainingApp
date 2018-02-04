public enum Size {
    SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");

    private String description;

    Size(String desc) {
        description = desc;
    }

    public String getDescription() {
        return description;
    }
}

