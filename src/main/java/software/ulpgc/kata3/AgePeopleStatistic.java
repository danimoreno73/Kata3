package software.ulpgc.kata3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgePeopleStatistic implements PeopleStatistic {
    @Override
    public Map<String, Integer> calculate(List<People> peopleList) {
        Map<String,Integer> result = new HashMap<>();
        for (People people : peopleList){
            try {
                String key =  toInterval(people.getBirthday());
                result.put(key, result.getOrDefault(key,0) + 1);
            } catch (Exception e) {
                continue;
            }
        }
        return result;
    }

    private String toInterval(String birthday) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return toInterval(LocalDate.now().toEpochDay() - LocalDate.parse(birthday,formatter).toEpochDay() );
    }

    private String toInterval(long days) {
        int age = (int) (days/365.25);

        if (age < 20) return "Less than 20 years";
        if (age < 25) return "Between 20-25 years";
        if (age < 30) return "Between 25-30 years";
        if (age < 35) return "Between 30-35 years";
        if (age < 40) return "Between 35-40 years";


        return "More than 40 years";
    }
}
