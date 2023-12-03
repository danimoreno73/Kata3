package software.ulpgc.kata3;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<People> people = CsvFilePeopleLoader.with(new File("people-10000.csv")).load();

        PeopleStatistic sexPeopleStatistic = new SexPeopleStatistic();
        PeopleStatistic agePeopleStatistic = new AgePeopleStatistic();

        Map<String,Integer> map = sexPeopleStatistic.calculate(people);
        for (String key : map.keySet()) System.out.println("Total " + key + "s = " + map.get(key));

        Map<String,Integer> agemap = agePeopleStatistic.calculate(people);
        for (String key : agemap.keySet()) System.out.println(key + " = " + agemap.get(key));

        MainFrame mainFrame = new MainFrame();
        mainFrame.barChartDisplay().show(agePeopleStatistic.calculate(people));
        mainFrame.setVisible(true);
    }





}
