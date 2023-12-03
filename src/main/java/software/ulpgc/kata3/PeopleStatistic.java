package software.ulpgc.kata3;

import java.util.List;
import java.util.Map;

public interface PeopleStatistic {

    Map<String, Integer> calculate(List<People> peopleList);
}
