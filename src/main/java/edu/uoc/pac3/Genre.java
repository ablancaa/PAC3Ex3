package edu.uoc.pac3;

public enum Genre {
    ACTION("Movies with shots, explosions, etc.","A"),
    ADVENTURE("Thousands of things happen","ADV"),
    COMEDY("Lot of laughs","C"),
    DRAMA("Plenty of sadness","D"),
    FANTASY("Imaginary friends","F"),
    HORROR("Screams","H"),
    MUSICAL("La, la, la","M"),
    ROMANCE("Love, love and much love","R"),
    SCIFI("Aliens, time travels and so on","SF"),
    THRILLER("Crimes, clues, policemen...","T"),
    WESTERN("Bang!!! Movies wanted","W");

    private String description;
    private String abbreviature;

    private Genre(String description, String abbreviature) {
        this.description = description;
        this.abbreviature = abbreviature;
    }
    public String getDescription() {
        return description;
    }
    public String getAbbreviation() {
        return abbreviature;
    }
    public static Genre getGenre(String abbreviationNew){
        return switch (abbreviationNew) {
            case "A" -> ACTION;
            case "ADV" -> ADVENTURE;
            case "C" -> COMEDY;
            case "D" -> DRAMA;
            case "F" -> FANTASY;
            case "H" -> HORROR;
            case "M" -> MUSICAL;
            case "R" -> ROMANCE;
            case "SF" -> SCIFI;
            case "T" -> THRILLER;
            case "W" -> WESTERN;
            default -> null;
        };
    }

    public static String getAbbreviationByIndex(int index){

        if(index < 0){
            index = 0;
        } else if (index > 10){
            index = 10;
        }
        return switch (index) {
            case 0 -> ACTION.abbreviature;
            case 1 -> ADVENTURE.abbreviature;
            case 2 -> COMEDY.abbreviature;
            case 3 -> DRAMA.abbreviature;
            case 4 -> FANTASY.abbreviature;
            case 5 -> HORROR.abbreviature;
            case 6 -> MUSICAL.abbreviature;
            case 7 -> ROMANCE.abbreviature;
            case 8 -> SCIFI.abbreviature;
            case 9 -> THRILLER.abbreviature;
            case 10 -> WESTERN.abbreviature;
            default -> null;
        };
    }

    public Genre next(){
        Genre[] arrayValores = Genre.values();
        Genre generoEntrante = getGenre(this.abbreviature);
        String genero="";
        int newIndex = 0;
        int indiceMas=0;
        for (int i=0; i < arrayValores.length; i++){
            if (generoEntrante.equals(arrayValores[i])){

                indiceMas=i+1;
                this.abbreviature = getAbbreviationByIndex(indiceMas);

            }
            //genero == String.valueOf(arrayValores[i]);
            System.out.println(generoEntrante.toString()+" - "+i);
        }
        Genre generoSaliente = getGenre(this.abbreviature);
        return generoSaliente;

    }


}

