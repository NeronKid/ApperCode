package ru.hachaton_avito.team.deployment.service;

import ru.hachaton_avito.team.deployment.models.BaseData;
import ru.hachaton_avito.team.deployment.models.Price;

public interface PriceService {
	//Service для интерфейса цен и всяких других взаимодействий с ценой
	Price findByLocationCategory(BaseData baseData);
}
