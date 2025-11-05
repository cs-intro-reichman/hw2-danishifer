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

        int newHours0 = newHours / 10;
        int newHours1 = newHours % 10;
        int newMinutes0 = newMinutes / 10;
        int newMinutes1 = newMinutes % 10;

        System.out.println("" + newHours0 + newHours1 + ":" + newMinutes0 + newMinutes1);
    }
}
