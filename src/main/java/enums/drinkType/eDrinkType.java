package enums.drinkType;

public enum eDrinkType {
    eFizzy,
    eStill,
    eTea,
    eAlcohol,
    eJuice;

    public static eDrinkType getDrinkType(String type) {
        for (eDrinkType drinkType : eDrinkType.values()) {
            if (drinkType.name().equals(type)) {
                return drinkType;
            }
        }
        return null;
    }
}
