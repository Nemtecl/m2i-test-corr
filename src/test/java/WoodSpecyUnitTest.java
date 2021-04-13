import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class WoodSpecyUnitTest {

    @Test
    public void souldCreateACedar() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.SOFT_WOOD;
        String expectedName = "Cedar";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.CEDAR;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateACypress() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.SOFT_WOOD;
        String expectedName = "Cypress";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.CYPRESS;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateALarch() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.SOFT_WOOD;
        String expectedName = "Pine";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.PINE;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAPine() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.SOFT_WOOD;
        String expectedName = "Larch";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.LARCH;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }


    @Test
    public void souldCreateAnAcacia() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Acacia";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.ACACIA;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAnAsh() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Ash";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.ASH;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAnEbony() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Ebony";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.EBONY;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAnELM() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Elm";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.ELM;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAGum() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Gum";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.GUM;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAMaple() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Maple";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.MAPLE;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAnOak() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.HARD_WOOD;
        String expectedName = "Oak";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.OAK;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateAPalmTree() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.PSEUDO_WOODS;
        String expectedName = "Bamboo";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.BAMBOO;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

    @Test
    public void souldCreateABamboo() {
        // GIVEN
        WoodSpecy specy;
        WoodType expectedType = WoodType.PSEUDO_WOODS;
        String expectedName = "Palm tree";
        String expectedPresentation =  "This is a " + expectedName;

        // WHEN
        specy = WoodSpecy.PALM_TREE;

        // THEN
        assertThat(specy).isNotEqualTo(null);
        assertThat(specy.name).isEqualTo(expectedName);
        assertThat(specy.woodType).isEqualTo(expectedType);
        assertThat(specy.presentation()).isEqualTo(expectedPresentation);
    }

}