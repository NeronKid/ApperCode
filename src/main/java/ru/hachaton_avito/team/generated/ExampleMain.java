package ru.hachaton_avito.team.generated;

import java.util.List;
import java.util.Map;

public class ExampleMain {
    public static void mainExample () {
        Boolean isBDFull = false; // это пример проверки на пустую БД

        if (isBDFull) {
            CategoryTree categoryNode = new CategoryTree();
            CategoryNode rootCategoryNode = categoryNode.getCategoriesTree();

            rootCategoryNode.getListTree(null, (node, parentId) -> {
                //тут вызываешь метод добавления в БД для CategoryDto(node.id, node.name)
                //тут вызываешь метод добавления в БД для CategoryGraphDto(node.id, parentId)
            });

            rootCategoryNode.printTree(0);
        }
        if (isBDFull) {
            LocationTree locationTree = new LocationTree();
            LocationNode rootLocationNode = locationTree.getLocationsTree();

            rootLocationNode.getListTree(null, (node, parentId) -> {
                //тут вызываешь метод добавления в БД для LocationDto(node.id, node.name)
                //тут вызываешь метод добавления в БД для LocationGraphDto(node.id, parentId)
            });

            rootLocationNode.printTree(0);
        }

        DiscountSegments discount = new DiscountSegments();

        List<Long> userIDs = List.of(2100L, 2200L, 2300L);
        Map<Long, List<Long>> dataDiscount = discount.getSegmentsByUserIDs(userIDs);




        System.out.printf(dataDiscount.toString());
    }
}