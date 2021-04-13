import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees;
    private float size;

    public Forest() {
        size = 0;
        trees = new ArrayList<>();
    }

    public Forest(List<Tree> trees, float size) {
        this.trees = trees;
        this.size = size;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void cut(Tree tree) {
        trees.remove(tree);
    }

    public void grow(Tree tree) {
        trees.add(tree);
    }

    public void plantNewTree(WoodSpecy ws) {
        Tree tree = new Tree(ws);
        trees.add(tree);
    }


}
