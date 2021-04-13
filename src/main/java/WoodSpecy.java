public enum WoodSpecy {
    CEDAR(WoodType.SOFT_WOOD, "Cedar"),
    CYPRESS(WoodType.SOFT_WOOD, "Cypress"),
    LARCH(WoodType.SOFT_WOOD, "Larch"),
    PINE(WoodType.SOFT_WOOD, "Pine"),

    ACACIA(WoodType.HARD_WOOD, "Acacia"),
    ASH(WoodType.HARD_WOOD, "Ash"),
    EBONY(WoodType.HARD_WOOD, "Ebony"),
    ELM(WoodType.HARD_WOOD, "Elm"),
    GUM(WoodType.HARD_WOOD, "Gum"),
    MAPLE(WoodType.HARD_WOOD, "Maple"),
    OAK(WoodType.HARD_WOOD, "Oak"),

    BAMBOO(WoodType.PSEUDO_WOODS, "Bamboo"),
    PALM_TREE(WoodType.PSEUDO_WOODS, "Palm tree");

    WoodType woodType;
    String name;

    WoodSpecy(WoodType wt, String name) {
        woodType = wt;
        this.name = name;
    }

    public String presentation() {
        return "This is a " + name;
    }


}
