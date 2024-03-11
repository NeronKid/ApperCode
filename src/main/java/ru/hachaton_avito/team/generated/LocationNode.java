package ru.hachaton_avito.team.generated;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class LocationNode {
    private static long locationID = 0;

    private long id;
    private String name;
    private List<LocationNode> children;

    public LocationNode(long id, String name) {
        this.id = id;
        this.name = name;
        this.children = new ArrayList<>();
    }

    public LocationNode(String name) {
        this(++locationID, name);
    }

    public LocationNode newLocation(String name) {
        return new LocationNode(name);
    }

    public void addChild(LocationNode child) {
        children.add(child);
    }

    public void printTree(int indent) {
        System.out.printf("%s%d - %s\n", generateLocationIndent(indent), id, name);
        for (LocationNode child : children) {
            child.printTree(indent + 2);
        }
    }
    public void getListTree(Long isParent, BiConsumer<LocationNode, Long> values) {
        values.accept(this, isParent);
        for (LocationNode child : children) {
            child.getListTree(this.id, values);
        }
    }

    private String generateLocationIndent(int indent) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            result.append(" ");
        }
        return result.toString();
    }
}