package com.timeradder;

public class TimeAdder {

    public static String addTime(int CurrentHour, int CurrentMinute, int CurrentSecond, int HoursForward, int MinutesForward, int SecondsForward) {
        int newHour = CurrentHour + HoursForward;
        int newMinute = CurrentMinute + MinutesForward;
        int newSecond = CurrentSecond + SecondsForward;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }

        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }

        if (newHour >= 12) {
            newHour -= 12;
        }

        int time = newHour * 10000 + newMinute * 100 + newSecond;
        return formatTime(time);
    }

    public static String formatTime(int time) {
        int hour = time / 10000;
        int minute = (time % 10000) / 100;
        int second = time % 100;

        return hour + ":" + minute + ":" + second;
    }

}
