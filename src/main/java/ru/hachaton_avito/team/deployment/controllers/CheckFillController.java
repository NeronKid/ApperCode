package ru.hachaton_avito.team.deployment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hachaton_avito.team.deployment.dto.CategoryDto;
import ru.hachaton_avito.team.deployment.dto.CategoryGraphDto;
import ru.hachaton_avito.team.deployment.dto.LocationDto;
import ru.hachaton_avito.team.deployment.dto.LocationGraphDto;
import ru.hachaton_avito.team.deployment.repository.CategoryGraphRepository;
import ru.hachaton_avito.team.deployment.repository.CategoryRepository;
import ru.hachaton_avito.team.deployment.repository.LocationGraphRepository;
import ru.hachaton_avito.team.deployment.repository.LocationRepository;
import ru.hachaton_avito.team.generated.CategoryNode;
import ru.hachaton_avito.team.generated.CategoryTree;
import ru.hachaton_avito.team.generated.LocationNode;
import ru.hachaton_avito.team.generated.LocationTree;

public class CheckFillController {

    @Autowired
    CategoryRepository category;
    @Autowired
    LocationRepository location;
    @Autowired
    LocationGraphRepository locationGraph;
    @Autowired
    CategoryGraphRepository categoryGraph;

    public void checkAndUpdateCategory() {
        long categoryCount = category.count();
        if (categoryCount < 1) {
            CategoryTree categoryTree = new CategoryTree();
            CategoryNode rootCategoryNode = categoryTree.getCategoriesTree();

            rootCategoryNode.getListTree(null, (node, parentId) -> {
                CategoryDto categoryNew = new CategoryDto();
                categoryNew.setId(node.id);
                categoryNew.setName(node.name);
                category.save(categoryNew);

                CategoryGraphDto categoryGraphNew = new CategoryGraphDto();
                categoryGraphNew.setId(node.id);
                categoryGraphNew.setIdParent(parentId);
                categoryGraph.save(categoryGraphNew);
            });
        }
    }


    public void checkAndUpdateLocation() {
        long locationCount = location.count();

        if (locationCount < 1) {
            LocationTree locationTree = new LocationTree();
            LocationNode rootLocationNode = locationTree.getLocationsTree();

            rootLocationNode.getListTree(null, (node, parentId) -> {

                LocationDto locationNew = new LocationDto();
                locationNew.setId(node.id);
                locationNew.setName(node.name);
                location.save(locationNew);


                LocationGraphDto locationGraphNew = new LocationGraphDto();
                locationGraphNew.setId(node.id);
                locationGraphNew.setIdParent(parentId);
                locationGraph.save(locationGraphNew);
            });
        }
    }
}
