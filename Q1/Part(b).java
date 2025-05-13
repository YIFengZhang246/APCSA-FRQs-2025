public int dogWalkShift(int startHour, int endHour) {
    int total = 0;

    for (int hour = startHour; hour <= endHour; hour++) {
        int dogs = walkDogs(hour);
        total += calculateEarnings(hour, dogs);
    }

    return total;
}

private int calculateEarnings(int hour, int dogsWalked) {
    int pay = dogsWalked * 5;
    if (dogsWalked == maxDogs || (hour >= 9 && hour <= 17)) {
        pay += 3;
    }
    return pay;
}
