import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ForestUnitTest {

    private List<Tree> trees;

    @BeforeEach
    public void initTrees() {
        trees =  new LinkedList<>(Arrays.asList(new Tree(WoodSpecy.ASH), new Tree(WoodSpecy.ACACIA),
                new Tree(WoodSpecy.BAMBOO)));
    }

    @Test
    public void should_instanciate_with_no_params() {
        //GIVEN
        Forest f;

        //WHEN
        f = new Forest();

        //THEN
        assertThat(f).isNotNull();
        assertThat(f.getTrees()).isNotNull();
        assertThat(f.getTrees().size()).isEqualTo(0);
        assertThat(f.getSize()).isEqualTo(0);
    }

    @Test
    public void should_instanciate_with_2_params() {
        //GIVEN
        Forest f;
        float size = 10F;

        //WHEN
        f = new Forest(trees, size);

        //THEN
        assertThat(f).isNotNull();
        assertThat(f.getTrees()).isNotNull();
        assertThat(f.getTrees().size()).isEqualTo(trees.size());
        assertThat(f.getSize()).isEqualTo(size);
    }

    @Test
    public void setTree_should_set_trees() {
        // GIVEN
        Forest f = new Forest();

        // WHEN
        f.setTrees(trees);

        // THEN
        assertThat(f.getTrees()).isNotNull();
        assertThat(f.getTrees().size()).isEqualTo(trees.size());
    }

    @Test
    public void setSize_should_set_size() {
        // GIVEN
        Forest f = new Forest();
        float size = 10F;

        // WHEN
        f.setSize(size);

        // THEN
        assertThat(f.getSize()).isEqualTo(size);
    }

    @Test
    public void plantNewTree_should_add_new_tree() {
        // GIVEN
        Forest f = new Forest();
        WoodSpecy specy = WoodSpecy.OAK;

        // WHEN
        f.plantNewTree(specy);

        // THEN
        assertThat(f.getTrees().get(0)).isNotNull();
        assertThat(f.getTrees().get(0).getSpecy()).isEqualTo(specy);
    }

    @Test
    public void grow_should_add_tree() {
        // GIVEN
        Forest f = new Forest();
        Tree newTree = new Tree(WoodSpecy.GUM);

        // WHEN
        f.grow(newTree);

        // THEN
        assertThat(f.getTrees().get(0)).isNotNull();
        assertThat(f.getTrees().get(0)).isEqualTo(newTree);
    }

    @Test
    public void cut_should_remove_tree() {
        // GIVEN
        Forest f = new Forest(trees, 10F);

        // WHEN
        f.cut(f.getTrees().get(0));

        // THEN
        assertThat(f.getTrees().size()).isEqualTo(2);
    }


}