package software.ulpgc.kata3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SexPeopleStatistic implements PeopleStatistic {


    @Override
    public Map<String, Integer> calculate(List<People> peopleList) {
        Map<String, Integer> result = new HashMap<>();
        for (People people : peopleList){
            String key = people.getSex();
            result.put(key, result.getOrDefault(key,0) + 1);

        }
        return result;
    }


}
