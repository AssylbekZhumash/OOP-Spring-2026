package pr2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if (h < 0 || h > 23) throw new IllegalArgumentException("Invalid hour: " + h);
        if (m < 0 || m > 59) throw new IllegalArgumentException("Invalid minute: " + m);
        if (s < 0 || s > 59) throw new IllegalArgumentException("Invalid second: " + s);

        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public String toUniversal() {
        if(hour < 10) {
            if(minute < 10) {
                if(second < 10) return "0" + hour + ":0" + minute + ":0" + second;
                else return "0" + hour + ":0" + minute + ":" + second;
            } else {
                if(second < 10) return "0" + hour + ":" + minute + ":0" + second;
                else return "0" + hour + ":" + minute + ":" + second;
            }
        } else {
            if(minute < 10) {
                if(second < 10) return hour + ":0" + minute + ":0" + second;
                else return hour + ":0" + minute + ":" + second;
            } else {
                if(second < 10) return hour + ":" + minute + ":0" + second;
                else return hour + ":" + minute + ":" + second;
            }
        }
    }

    public String toStandard() {
        int displayHour = hour;
        String period = "AM";

        if (hour == 0) {
            displayHour = 12;
        } else if (hour == 12) {
            period = "PM";
        } else if (hour > 12) {
            displayHour = hour - 12;
            period = "PM";
        }

        String hourStr = (displayHour < 10) ? "0" + displayHour : "" + displayHour;
        String minuteStr = (minute < 10) ? "0" + minute : "" + minute;
        String secondStr = (second < 10) ? "0" + second : "" + second;

        return hourStr + ":" + minuteStr + ":" + secondStr + " " + period;
    }

    public Time add(Time other) {
        int newHour = this.hour + other.hour;
        int newMinute = this.minute + other.minute;
        int newSecond = this.second + other.second;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }
        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }
        if (newHour >= 24) {
            newHour -= 24;
        }

        return new Time(newHour, newMinute, newSecond);
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        Time result = t.add(t2);
        System.out.println(result.toUniversal());
    }
}