public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    Pizza(boolean ts, boolean ch, boolean mr, boolean hm) {
        tomatoSauce = ts;
        cheese = ch;
        mushrooms = mr;
        ham = hm;
    }


    /*public String toString() {
        //przypisanie nazwy pizzy

        *//*  Klasa przesłania metodę toString() z klasy Object, dzięki czemu zwraca nazwę
        zmiennej w czytelnej formie (MEDIUM). Innym sposobem na uzyskanie nazwy wartości
        w postaci Stringa jest wywołanie metody name()
         jej wynik jest identyczny z domyślną metodą toString().
        //informacja o składnikach*//*

        String result= this.name() + "(";//!!!!!!!!!
        *//*if(tomatoSauce) {
            result = result + "sos pomidorowy";
        }
        if(cheese) {
            result = result + ", ser";
        }
        if(mushrooms) {
            result = result + ", pieczarki";
        }
        if(ham) {
            result = result + ", szynka";
        }
        result = result + ")";*//*

        return result;
    }*/
}

