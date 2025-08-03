import java.util.Scanner;

public class CalenderAppNewFeatures {

    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int d = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (d + 6) % 7;
    }

    static void printCalendar(int month, int year) {
        daysInMonth[1] = isLeapYear(year) ? 29 : 28;
        int totalDays = daysInMonth[month];

        int firstDay = getDayOfWeek(1, month + 1, year);
        int totalSlots = 35;
        int overflow = firstDay + totalDays - totalSlots;

        System.out.println("\n   " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int day = 1, overflowtemp=overflow;

        for (int slot = 0; slot < totalSlots; slot++) {
            if (slot < firstDay && overflowtemp > 0) {
                int overflowDay = totalDays - overflow + slot + 1;
                System.out.printf("%3d ", overflowDay);
                overflowtemp--;
            }
            else if (slot >= firstDay && day <= totalDays) {
                System.out.printf("%3d ", day++);
            }
            else {
                System.out.print("    ");
            }
            if ((slot + 1) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = 0, year;

        System.out.print("Enter year (e.g., 2025): ");
        year = sc.nextInt();

        while (true) {
            printCalendar(month, year);
            System.out.print("\n[P]revious | [N]ext | [E]xit: ");
            char choice = sc.next().toUpperCase().charAt(0);

            if (choice == 'P') {
                month--;
                if (month < 0) {
                    month = 11;
                    year--;
                }
            } else if (choice == 'N') {
                month++;
                if (month > 11) {
                    month = 0;
                    year++;
                }
            } else if (choice == 'E') {
                System.out.println("Thankyou");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}