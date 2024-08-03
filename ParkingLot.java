public class ParkingLot {
    public static int maxCarsParked(int n, char[] arr) {
        int maxCars = 0;
        int currentCars = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'S') {
                currentCars++;
            } else {
                maxCars += currentCars; // Add the current count of cars that can park
                currentCars = 0; // Reset current count
            }
        }

        // Add any remaining cars parked at the end of the array
        maxCars += currentCars;

        return maxCars;
    }

    public static void main(String[] args) {
        int n = 16;
        char[] arr = "XXXSXXSXXSSXXSXX".toCharArray();
        System.out.println(maxCarsParked(n, arr)); // Output: 7
    }
}
