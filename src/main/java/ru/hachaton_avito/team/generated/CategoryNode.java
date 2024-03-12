package ru.hachaton_avito.team.generated;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class CategoryNode {
    private static long categoryID = 0;

    final long id;
    final String name;
    final List<CategoryNode> children;

    public CategoryNode(long id, String name) {
        this.id = id;
        this.name = name;
        this.children = new ArrayList<>();
    }

    public CategoryNode(String name) {
        this(++categoryID, name);
    }

    public void addChild(CategoryNode child) {
        children.add(child);
    }

    public void printTree(int indent) {
        System.out.printf("%s%d - %s\n", generateCategoryIndent(indent), id, name);
        for (CategoryNode child : children) {
            child.printTree(indent + 2);
        }
    }

    public void getListTree(Long isParent, BiConsumer<CategoryNode, Long> values) {
        values.accept(this, isParent);
        for (CategoryNode child : children) {
            child.getListTree(this.id, values);
        }
    }

    private String generateCategoryIndent(int indent) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            result.append(" ");
        }
        return result.toString();
    }
}