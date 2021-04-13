import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

class TreeUnitTest {

    @Test
    public void should_instanciate_with_1_params() {
        //GIVEN
        Tree t;
        WoodSpecy specy = WoodSpecy.PINE;

        //WHEN
        t = new Tree(specy);

        //THEN
        assertThat(t).isNotEqualTo(null);
        assertThat(t.getSpecy()).isEqualTo(specy);
    }

    @Test
    public void should_instanciate_with_3_params() {
        //GIVEN
        Tree t;
        WoodSpecy specy = WoodSpecy.PINE;
        float size = 10.5F;
        int number = 5;

        //WHEN
        t = new Tree(specy, size, number);

        //THEN
        assertThat(t).isNotEqualTo(null);
        assertThat(t.getSpecy()).isEqualTo(specy);
        assertThat(t.getSize()).isEqualTo(size);
        assertThat(t.getNumber()).isEqualTo(number);
    }

    @Test
    public void should_set_specy() {
        //GIVEN
        WoodSpecy newSpecy = WoodSpecy.ACACIA;
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;


        //WHEN
        t.setSpecy(newSpecy);

        //THEN
        assertThat(t.getSpecy()).isEqualTo(newSpecy);
    }

    @Test
    public void should_set_age() {
        //GIVEN
        int newAge = 18;
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;

        //WHEN
        t.setAge(newAge);

        //THEN
        assertThat(t.getAge()).isEqualTo(newAge);
    }

    @Test
    public void should_set_last_prune() {
        //GIVEN
        LocalDate newDate = LocalDate.now();
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;

        //WHEN
        t.setLastPrune(newDate);

        //THEN
        assertThat(t.getLastPrune()).isEqualTo(newDate);
    }

    @Test
    public void should_set_last_prune_with_prune() {
        //GIVEN
        LocalDate newDate = LocalDate.now();
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;

        //WHEN
        t.prune();

        //THEN
        assertThat(t.getLastPrune()).isEqualTo(newDate);
    }

    @Test
    public void should_set_size() {
        //GIVEN
        float size = 20F;
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;

        //WHEN
        t.setSize(size);

        //THEN
        assertThat(t.getSize()).isEqualTo(size);
    }

    @Test
    public void should_set_number() {
        //GIVEN
        int newNumber = 50;
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;

        //WHEN
        t.setNumber(newNumber);

        //THEN
        assertThat(t.getNumber()).isEqualTo(newNumber);
    }

    @Test
    public void nextCut_should_return_exception() {
        //GIVEN
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);;

        //WHEN
        // THEN
        assertThatExceptionOfType(IllegalStateException.class).isThrownBy(t::nextCut);
    }

    @Test
    public void nextCut_should_return_years_plus_two() {
        //GIVEN
        LocalDate expected = LocalDate.now().plusYears(2);
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);
        t.prune();

        //WHEN
        LocalDate result = t.nextCut();

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void toString_should_equals_expected() {
        // GIVEN
        String expected = "Tree{specy=ASH, size=10.0, number=7, age=0, lastPrune=2021-04-13}";
        Tree t = new Tree(WoodSpecy.ASH, 10F, 7);
        t.prune();

        // WHEN
        String result = t.toString();

        // THEN
        assertThat(result).isEqualTo(expected);

    }

}