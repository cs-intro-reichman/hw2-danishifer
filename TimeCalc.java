public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; // Expecting format "hh:mm"
        int minutesToAdd = Integer.parseInt(args[1]);

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        int totalMinutes = hour * 60 + minute + minutesToAdd;
        int totalHours = (totalMinutes / 60);
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}
