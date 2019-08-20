import java.util.ArrayList;
import java.util.List;

class TimeFormatter {

    public static String formatDuration(int seconds) {

        int yearsCounter = 0;
        int daysCounter = 0;
        int hoursCounter = 0;
        int minutesCounter = 0;

        List<Integer> timeValues = new ArrayList<>();
        List<Integer> newTimeValues = new ArrayList<>();
        List<String> descriptions = new ArrayList<>();

        if(seconds != 0){
            yearsCounter = seconds / 31536000;
            seconds = seconds - yearsCounter * 31536000;
            timeValues.add(yearsCounter);
            String yearsDescription = (yearsCounter > 1) ? "years" : "year";

            daysCounter = seconds / 86400;
            seconds = seconds - daysCounter * 86400;
            timeValues.add(daysCounter);
            String daysDescription = (daysCounter > 1) ? "days" : "day";

            hoursCounter = seconds /3600;
            seconds = seconds - hoursCounter * 3600;
            timeValues.add(hoursCounter);
            String hoursDescription = (hoursCounter > 1) ? "hours" : "hour";

            minutesCounter = seconds /60;
            seconds = seconds - minutesCounter *60;
            timeValues.add(minutesCounter);
            String minutesDescription = (minutesCounter > 1) ? "minutes" : "minute";

            timeValues.add(seconds);
            String secondsDescription = (seconds > 1) ? "seconds" : "second";

            for(int i = 0; i < timeValues.size(); i++){
                if(timeValues.get(i) != 0){
                    newTimeValues.add(timeValues.get(i));
                    switch(i){
                        case 0: descriptions.add(yearsDescription);
                        case 1: descriptions.add(daysDescription);
                        case 2: descriptions.add(hoursDescription);
                        case 3: descriptions.add(minutesDescription);
                        case 4: descriptions.add(secondsDescription);
                    }
                }

            }

            switch(newTimeValues.size()){
                case 1: return String.format("%d %s",                                   newTimeValues.get(0), descriptions.get(0));

                case 2: return String.format("%d %s and %d %s",                         newTimeValues.get(0), descriptions.get(0),
                                                                                        newTimeValues.get(1), descriptions.get(1));

                case 3: return String.format("%d %s, %d %s and %d %s",                  newTimeValues.get(0), descriptions.get(0),
                                                                                        newTimeValues.get(1), descriptions.get(1),
                                                                                        newTimeValues.get(2), descriptions.get(2));

                case 4: return String.format("%d %s, %d %s, %d %s and %d %s",           newTimeValues.get(0), descriptions.get(0),
                                                                                        newTimeValues.get(1), descriptions.get(1),
                                                                                        newTimeValues.get(2), descriptions.get(2),
                                                                                        newTimeValues.get(3), descriptions.get(3));

                case 5: return String.format("%d %s, %d %s, %d %s, %d %s and %d %s",    newTimeValues.get(0), descriptions.get(0),
                                                                                        newTimeValues.get(1), descriptions.get(1),
                                                                                        newTimeValues.get(2), descriptions.get(2),
                                                                                        newTimeValues.get(3), descriptions.get(3),
                                                                                        newTimeValues.get(4), descriptions.get(4));
            }
        }

        return  "now";
    }
}
