package enums.cardType;

public enum eCardType {
    eHUMO,
    eUzCard;

    public static eCardType getCardType(String type) {
        for (eCardType eCardType : eCardType.values()) {
            if (eCardType.name().equals(type)) {
                return eCardType;
            }
        }
        return null;
    }
}
