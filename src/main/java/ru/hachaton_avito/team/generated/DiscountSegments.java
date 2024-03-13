package ru.hachaton_avito.team.generated;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class DiscountSegments {
    Map<Long, List<Long>> db = Map.ofEntries(
            entry(2100L, List.of(156L, 278L)),
            entry(2200L, List.of(168L, 290L, 412L)),
            entry(2300L, List.of(180L)),
            entry(2400L, List.of(192L, 314L, 436L, 158L)),
            entry(2500L, List.of(204L, 326L, 148L, 370L, 592L)),
            entry(2600L, List.of(216L)),
            entry(2700L, List.of(228L, 350L, 472L, 194L)),
            entry(2800L, List.of()),
            entry(2900L, List.of(240L, 362L, 484L, 206L, 428L)),
            entry(3000L, List.of(252L, 374L)),
            entry(3100L, List.of(264L, 386L, 508L, 230L)),
            entry(3200L, List.of(276L, 398L)),
            entry(3300L, List.of(288L, 410L, 532L, 254L)),
            entry(3400L, List.of(300L, 422L, 544L, 166L)),
            entry(3500L, List.of(312L, 434L)),
            entry(3600L, List.of(324L, 446L, 568L, 190L)),
            entry(3700L, List.of(336L, 458L)),
            entry(3800L, List.of(348L, 470L, 592L, 214L)),
            entry(3900L, List.of(360L, 482L, 604L, 226L)),
            entry(4000L, List.of(372L, 494L, 616L, 238L)),
            entry(4100L, List.of(384L, 506L, 628L, 250L)),
            entry(4200L, List.of(396L, 518L, 640L, 262L))
    );

    public Map<Long, List<Long>> getSegmentsByUserIDs(List<Long> userIDs) {
        Map<Long, List<Long>> result = new HashMap<>();

        for (Long userID : userIDs) {
            result.put(userID, this.db.getOrDefault(userID, Collections.emptyList()));
        }

        return result;
    }
}
