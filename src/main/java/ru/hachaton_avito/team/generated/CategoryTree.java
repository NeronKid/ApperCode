package ru.hachaton_avito.team.generated;


import java.util.List;
import java.util.Map;

import static java.util.Map.entry;


public class CategoryTree {

    static Map<String, List<String>> rawCategory = Map.ofEntries(
            entry("Бытовая электроника", List.of("Товары для компьютера", "Фототехника", "Телефоны", "Планшеты и электронные книги", "Оргтехника и расходники", "Ноутбуки", "Настольные компьютеры", "Игры, приставки и программы", "Аудио и видео")),
            entry("Готовый бизнес и оборудование", List.of("Готовый бизнес", "Оборудование для бизнеса")),
            entry("Для дома и дачи", List.of("Мебель и интерьер", "Ремонт и строительство", "Продукты питания", "Растения", "Бытовая техника", "Посуда и товары для кухни")),
            entry("Животные", List.of("Другие животные", "Товары для животных", "Птицы", "Аквариум", "Кошки", "Собаки")),
            entry("Личные вещи", List.of("Детская одежда и обувь", "Одежда, обувь, аксессуары", "Товары для детей и игрушки", "Часы и украшения", "Красота и здоровье")),
            entry("Недвижимость", List.of("Недвижимость за рубежом", "Квартиры", "Коммерческая недвижимость", "Гаражи и машиноместа", "Земельные участки", "Дома, дачи, коттеджи", "Комнаты")),
            entry("Работа", List.of("Резюме", "Вакансии")),
            entry("Транспорт", List.of("Автомобили", "Запчасти и аксессуары", "Грузовики и спецтехника", "Водный транспорт", "Мотоциклы и мототехника")),
            entry("Услуги", List.of("Предложения услуг")),
            entry("Хобби и отдых", List.of("Охота и рыбалка", "Спорт и отдых", "Коллекционирование", "Книги и журналы", "Велосипеды", "Музыкальные инструменты", "Билеты и путешествия"))
    );

    public static CategoryNode getCategoriesTree() {
        CategoryNode rootNode = new CategoryNode("ROOT");
        for (Map.Entry<String, List<String>> entry : rawCategory.entrySet()) {
            String category = entry.getKey();
            List<String> subCategories = entry.getValue();
            CategoryNode categoryNode = new CategoryNode(category);
            for (String subCategory : subCategories) {
                CategoryNode subCategoryNode = new CategoryNode(subCategory);
                categoryNode.addChild(subCategoryNode);
            }
            rootNode.addChild(categoryNode);
        }
        return rootNode;
    }
}